package Budget.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Budget.Dto.BudgetCategoryDto;
import Budget.Dto.POGenerationDto;
import Budget.Model.POGenerationModel;
import Budget.Model.VendorModel;
import Budget.Service.POGenerationService;

@RestController

@CrossOrigin("http://localhost:4200")
@RequestMapping("/poGeneration")
public class POGenerationController {
	@Autowired

	private POGenerationService POGenerationService;

	@PostMapping("/generatePO")

	public ResponseEntity addPO(@RequestBody POGenerationDto poGenerationDto) {

		return ResponseEntity.ok(POGenerationService.addPO(poGenerationDto));
	}
	@GetMapping("/findAllPO")

	public ResponseEntity findAllPO() {
		return ResponseEntity.ok(POGenerationService.findAll());
	}

}
