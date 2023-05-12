package Budget.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Budget.Dto.VendorDto;
import Budget.Model.SubCategoryModel;
import Budget.Model.VendorModel;
import Budget.Service.VendorService;

@RestController
//@CrossOrigin("http://10.44.33.127:4200")
//@CrossOrigin("http://10.44.33.196:4200")
@CrossOrigin("http://localhost:4200")
@RequestMapping("/vendor")
public class VendorController {

	@Autowired
	private VendorService vendorService;

	@PostMapping("/vendor")
	public ResponseEntity addVendor(@RequestBody VendorDto vendorDto) {
		return ResponseEntity.ok(vendorService.addVendor(vendorDto));
	}

	@GetMapping("/findAllVendor")
	public ResponseEntity findAllVendor() {
		return ResponseEntity.ok(vendorService.findAll());
	}

	@GetMapping("/{id}")
	public Optional<VendorModel> gelVendorDetails(@PathVariable long id) {
		return vendorService.findById(id);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity deleteVendor(@PathVariable long id) {
		vendorService.deleteVendor(id);
		return new ResponseEntity("vendor deleted sucessfully", HttpStatus.OK);
	}

	@PutMapping("update/{id}")
	public VendorModel updateVendor(@RequestBody VendorModel vendorModel) {
		return vendorService.updateVendor(vendorModel);
	}

}
