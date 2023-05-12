package Budget.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Budget.Dto.PODto;
import Budget.Model.POModel;
import Budget.Service.POService;

@RestController
@RequestMapping("poGeneration")
@CrossOrigin("http://localhost:4200")
public class POController {

	@Autowired
	public POService poService;

	@PostMapping("/generatePO")
	public ResponseEntity addPO(@RequestBody PODto poDto) {
		return ResponseEntity.ok(poService.addPO(poDto));
	}

	@GetMapping("findAllPO")
	public ResponseEntity findAllPO() {
		return ResponseEntity.ok(poService.FindAll());
	}
}
