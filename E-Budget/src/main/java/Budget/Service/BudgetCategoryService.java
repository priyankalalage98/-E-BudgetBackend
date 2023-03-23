package Budget.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import Budget.Dto.BudgetCategoryDto;
import Budget.Dto.VendorDto;
import Budget.Model.BudgetCategoryModel;
import Budget.Model.VendorModel;
import Budget.Repository.BudgetCategoryRepository;

@Service
public class BudgetCategoryService {

	@Autowired
	private BudgetCategoryRepository budgetCategoryRepository;

//	public BudgetCategoryModel addBudgetCategory(BudgetCategoryDto budgetCategoryDto) {
//
//		BudgetCategoryModel budgetCategoryModel = new BudgetCategoryModel();
//
//		budgetCategoryModel.setBudgetCategoryName(budgetCategoryDto.getBudgetCategoryName());
//		budgetCategoryModel.setBudgetCategoryDescription(budgetCategoryDto.getBudgetCategoryDescription());
//		budgetCategoryModel = budgetCategoryRepository.save(budgetCategoryModel);
public  ResponseEntity<BudgetCategoryModel> addBudgetCategory(BudgetCategoryDto budgetCategoryDto) {
		
	BudgetCategoryModel budgetCategoryModel = new BudgetCategoryModel();
		
	budgetCategoryModel.setBudgetCategoryName(budgetCategoryDto.getBudgetCategoryName());
	budgetCategoryModel.setBudgetCategoryDescription(budgetCategoryDto.getBudgetCategoryDescription());
	
	budgetCategoryModel=budgetCategoryRepository.save(budgetCategoryModel);
		
	return new ResponseEntity<>(budgetCategoryModel,HttpStatus.OK);
//		return budgetCategoryModel;
	}
}
