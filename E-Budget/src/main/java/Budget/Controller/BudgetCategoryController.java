package Budget.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Budget.Dto.BudgetCategoryDto;
import Budget.Dto.VendorDto;
import Budget.Model.BudgetCategoryModel;
import Budget.Service.BudgetCategoryService;

@RestController

@CrossOrigin("http://10.44.33.196:4200")

public class BudgetCategoryController {
	@Autowired

	private BudgetCategoryService budgetcategoryService;

	@PostMapping("/budgetCategory")

//	public BudgetCategoryModel addBudgetCategory(@RequestBody BudgetCategoryDto budgetCategoryDto) {
//
//		return budgetcategoryService.addBudgetCategory(budgetCategoryDto);
//	}
	public ResponseEntity addBudgetCategory(@RequestBody BudgetCategoryDto budgetCategoryDto) {
		
		return ResponseEntity.ok(budgetcategoryService.addBudgetCategory(budgetCategoryDto));
	}

	


}
