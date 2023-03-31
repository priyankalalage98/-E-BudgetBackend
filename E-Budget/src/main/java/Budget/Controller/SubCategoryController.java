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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Budget.Dto.SubCategoryDto;
import Budget.Model.BudgetCategoryModel;
import Budget.Model.SubCategoryModel;
import Budget.Service.SubCategoryService;

@RestController

@CrossOrigin("http://10.44.33.196:4200")

@RequestMapping("/subCategory")
public class SubCategoryController {
	@Autowired

	private SubCategoryService categoryService;

	@PostMapping("/subCategory")

	public ResponseEntity addSubCategory(@RequestBody SubCategoryDto subCategoryDto) {

		return ResponseEntity.ok(categoryService.addSubCategory(subCategoryDto));
	}

	
@GetMapping("/findAllBudgetSubCategory")
	
	public ResponseEntity findAllBudgetCreation() {
		return ResponseEntity.ok(categoryService.findAll());
	}


@GetMapping("/{id}")
public Optional<SubCategoryModel>getBudgetSubCategoryDetails(@PathVariable long id){
	return categoryService.findById(id);
	
}

@DeleteMapping("/{id}")
public ResponseEntity deleteSubCategory(@PathVariable long id) {
	categoryService.deleteSubCategory(id);
	return new ResponseEntity("BudgetCategory deleted sucessfully",HttpStatus.OK);
}


}
