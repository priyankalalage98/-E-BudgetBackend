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

import Budget.Dto.BudgetCategoryDto;
import Budget.Dto.VendorDto;
import Budget.Model.BudgetCategoryModel;
import Budget.Model.VendorModel;
import Budget.Service.BudgetCategoryService;

@RestController

//@CrossOrigin("http://10.44.33.127:4200")
@CrossOrigin("http://localhost:4200")
@RequestMapping("/budgetCategory")
public class BudgetCategoryController {
	@Autowired

	private BudgetCategoryService budgetcategoryService;

	@PostMapping("/budgetCategory")

	public ResponseEntity addBudgetCategory(@RequestBody BudgetCategoryDto budgetCategoryDto) {

		return ResponseEntity.ok(budgetcategoryService.addBudgetCategory(budgetCategoryDto));
	}


	@GetMapping("/findAllBudgetCategory")

	public ResponseEntity findAllBudgetCreation() {
		return ResponseEntity.ok(budgetcategoryService.findAll());
	}

	@GetMapping("/{id}")
	public Optional<BudgetCategoryModel> getBudgetCategoryDetails(@PathVariable long id) {
		return budgetcategoryService.findById(id);

	}

	@DeleteMapping("/{id}")
	public ResponseEntity deleteBudgetCategory(@PathVariable long id) {
		budgetcategoryService.deleteBudgetCategory(id);
		return new ResponseEntity("BudgetCategory deleted sucessfully", HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public BudgetCategoryModel updateBudgetCategory(@RequestBody BudgetCategoryModel budgetCategoryModel) {
		return budgetcategoryService.updateBudgetCategory(budgetCategoryModel);

	}

}