package Budget.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Budget.Dto.BudgetCreationDto;
import Budget.Service.BudgetCreationService;

@RestController
@CrossOrigin("http://10.44.33.196:4200")

public class BudgetCreationController {
	@Autowired
	private BudgetCreationService budgetCreationService;
	
	@PostMapping("/createbudget")
	
	public ResponseEntity addBudget(@RequestBody BudgetCreationDto budgetCreationDto)
	{
		return ResponseEntity.ok(budgetCreationService.addBudget(budgetCreationDto));
	}

}
