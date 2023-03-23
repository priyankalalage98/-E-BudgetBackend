package Budget.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Budget.Service.FindAllVendorService;
@CrossOrigin("http://10.44.33.196:4200")
@RestController
public class FindAllVendorController {
	@Autowired
	private  FindAllVendorService findAllVendorService;
	
	@GetMapping("/findAllVendor")
	public ResponseEntity findAllVendor() {
		return ResponseEntity.ok(findAllVendorService.findAll());
	}
	

}