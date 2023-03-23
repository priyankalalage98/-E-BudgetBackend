package Budget.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import Budget.Dto.FindAllBudgetCategoryDto;
import Budget.Dto.FindAllVendorDto;
import Budget.Model.FindAllBudgetCategoryModel;
import Budget.Model.FindAllVendorModel;
import Budget.Repository.BudgetCategoryRepository;
import Budget.Repository.FindAllBudgetCategoryRepository;
import Budget.Repository.FindAllVendorRepository;

@Service
public class FindAllBudgetCategoryService {
	@Autowired
	private BudgetCategoryRepository budgetCategoryRepository;
	
	public Object findAll() {
		return budgetCategoryRepository.findAll();
		
	}
	
	public Object addBudgetCategory(FindAllBudgetCategoryDto findAllBudgetCategoryDto) {
		FindAllBudgetCategoryModel findAllBudgetCategoryModel = new FindAllBudgetCategoryModel();
		findAllBudgetCategoryModel.setBudgetCategoryName(findAllBudgetCategoryDto.getBudgetCategoryName());
//		findAllBudgetCategoryModel =budgetCategoryRepository.save(findAllBudgetCategoryModel);
		return new ResponseEntity<>(findAllBudgetCategoryModel.getId(),HttpStatus.OK);
	}

}
