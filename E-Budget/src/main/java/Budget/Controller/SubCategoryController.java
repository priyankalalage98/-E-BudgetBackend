package Budget.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import Budget.Dto.SubCategoryDto;
import Budget.Service.SubCategoryService;

@RestController

@CrossOrigin("http://localhost:4200")

public class SubCategoryController {
	@Autowired

	private SubCategoryService categoryService;

	@PostMapping("/subCategory")

	public ResponseEntity addSubCategory(@RequestBody SubCategoryDto subCategoryDto) {

		return ResponseEntity.ok(categoryService.addSubCategory(subCategoryDto));
	}

}
