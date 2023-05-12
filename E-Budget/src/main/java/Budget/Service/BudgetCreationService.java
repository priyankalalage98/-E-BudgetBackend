package Budget.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import Budget.Dto.BudgetCreationDto;
import Budget.Model.BudgetCreationModel;
import Budget.Repository.BudgetCreationRepository;

@Service
public class BudgetCreationService {

	@Autowired
	private BudgetCreationRepository budgetCreationRepository;

	public Object findAll() {
		return budgetCreationRepository.findAll();
	}

	public ResponseEntity<BudgetCreationModel> addBudget(BudgetCreationDto budgetCreationDto) {

		BudgetCreationModel budgetCreationModel = new BudgetCreationModel();

		budgetCreationModel.setRemark(budgetCreationDto.getRemark());
		budgetCreationModel.setBudgetSubCategoryName(budgetCreationDto.getBudgetSubCategoryName());
		budgetCreationModel.setBudgetCategoryName(budgetCreationDto.getBudgetCategoryName());
		budgetCreationModel.setBudgetType(budgetCreationDto.getBudgetType());
		budgetCreationModel.setAmount(budgetCreationDto.getAmount());
		budgetCreationModel.setAmountInWords(budgetCreationDto.getAmountInWords());
		budgetCreationModel.setBudgetCode(budgetCreationDto.getBudgetCode());
		budgetCreationModel = budgetCreationRepository.save(budgetCreationModel);

		return new ResponseEntity<>(budgetCreationModel, HttpStatus.OK);

	}

}
