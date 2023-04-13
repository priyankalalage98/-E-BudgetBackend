package Budget.Service;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ibm.icu.util.Calendar;

import Budget.Dto.BudgetCategoryDto;
import Budget.Dto.VendorDto;
import Budget.Model.BudgetCategoryModel;
import Budget.Model.VendorModel;
import Budget.Repository.BudgetCategoryRepository;

@Service
public class BudgetCategoryService {

	@Autowired
	private BudgetCategoryRepository budgetCategoryRepository;

	public Object findAll() {
		return budgetCategoryRepository.findAll();
	}

	public ResponseEntity<BudgetCategoryModel> addBudgetCategory(BudgetCategoryDto budgetCategoryDto) {

		BudgetCategoryModel budgetCategoryModel = new BudgetCategoryModel();

		budgetCategoryModel.setBudgetCategoryName(budgetCategoryDto.getBudgetCategoryName());
		budgetCategoryModel.setRemark(budgetCategoryDto.getRemark());
		budgetCategoryModel.setStatus(budgetCategoryDto.isStatus());
		budgetCategoryModel = budgetCategoryRepository.save(budgetCategoryModel);

		return new ResponseEntity<>(budgetCategoryModel, HttpStatus.OK);
		

	}
	

	public Optional<BudgetCategoryModel> findById(long id) {
		return budgetCategoryRepository.findById((int) id);
	}

	public void deleteBudgetCategory(long id) {
		budgetCategoryRepository.deleteById((int) id);
	}

	public BudgetCategoryModel updateBudgetCategory(BudgetCategoryModel budgetCategoryModel) {
		// TODO Auto-generated method stub
		return budgetCategoryRepository.save(budgetCategoryModel);
	}

	

	
	

		
	
	
	
	
	
	
	
}




