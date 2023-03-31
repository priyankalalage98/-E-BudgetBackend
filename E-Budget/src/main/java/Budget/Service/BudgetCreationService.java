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

	public ResponseEntity<BudgetCreationModel> addBudget(BudgetCreationDto budgetCreationDto) {
		BudgetCreationModel budgetCreationModel = new BudgetCreationModel();

		budgetCreationModel.setCapitalAmount(budgetCreationDto.getCapitalAmount());
		budgetCreationModel.setRevenueAmount(budgetCreationDto.getRevenueAmount());
		budgetCreationModel.setRemark(budgetCreationDto.getRemark());
		budgetCreationModel.setBudgetCategoryDescription(budgetCreationDto.getBudgetCategoryDescription());
		budgetCreationModel = budgetCreationRepository.save(budgetCreationModel);

		return new ResponseEntity<>(budgetCreationModel, HttpStatus.OK);

	}

}
