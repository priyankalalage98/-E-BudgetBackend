package Budget.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Budget.Dto.VendorDto;
import Budget.Service.VendorService;

@RestController

@CrossOrigin("http://10.44.33.196:4200")
public class VendorController {
	@Autowired
	
	private VendorService vendorService;
	
	@PostMapping("/vendor")
	
	public ResponseEntity addVendor(@RequestBody VendorDto vendorDto) {
		
		return ResponseEntity.ok(vendorService.addVendor(vendorDto));
	}

}
