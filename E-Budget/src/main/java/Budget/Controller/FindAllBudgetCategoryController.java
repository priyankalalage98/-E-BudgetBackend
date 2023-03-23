package Budget.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Budget.Service.FindAllBudgetCategoryService;


@CrossOrigin("http://10.44.33.196:4200")
@RestController
public class FindAllBudgetCategoryController {
	@Autowired
	private  FindAllBudgetCategoryService findAllBudgetCategoryService;
	
	@GetMapping("/findAllBudgetCategory")
	
	public ResponseEntity findAllBudgetCreation() {
		return ResponseEntity.ok(findAllBudgetCategoryService.findAll());
	}
	

}
