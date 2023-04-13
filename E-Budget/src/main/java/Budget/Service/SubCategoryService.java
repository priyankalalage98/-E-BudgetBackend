package Budget.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import Budget.Dto.BudgetCategoryDto;
import Budget.Dto.SubCategoryDto;
import Budget.Model.BudgetCategoryModel;
import Budget.Model.SubCategoryModel;
import Budget.Repository.SubCategoryRepository;

@Service
public class SubCategoryService {

	@Autowired
	private SubCategoryRepository subCategoryRepository;

	public Object findAll() {
		return subCategoryRepository.findAll();

	}
//@Autowired
//private BudgetCategoryModel budgetCategoryModel;
//
//@Autowired
//private BudgetCategoryDto budgetCategoryDto;

	public ResponseEntity<SubCategoryModel> addSubCategory(SubCategoryDto subCategoryDto) {

		SubCategoryModel subCategoryModel = new SubCategoryModel();
		subCategoryModel.setBudgetSubCategoryName(subCategoryDto.getBudgetSubCategoryName());
		subCategoryModel.setBudgetCategoryName(subCategoryDto.getBudgetCategoryName());
		subCategoryModel.setBudgetCode(subCategoryDto.getBudgetCode());
		subCategoryModel.setRemark(subCategoryDto.getRemark());
		subCategoryModel.setStatus(subCategoryDto.isStatus());
		subCategoryModel.setBudgetType(subCategoryDto.getBudgetType());
		subCategoryModel = subCategoryRepository.save(subCategoryModel);
//		subCategoryModel.setCreatedDate(subCategoryDto.getCreatedDate());

		return new ResponseEntity<>(subCategoryModel, HttpStatus.OK);

	}

	public Optional<SubCategoryModel> findById(long id) {
		return subCategoryRepository.findById((int) id);
	}

	public void deleteSubCategory(long id) {
		subCategoryRepository.deleteById((int) id);
	}
	
	public SubCategoryModel updateBudgetSubCategory(SubCategoryModel subCategoryModel) {
		// TODO Auto-generated method stub
		return subCategoryRepository.save(subCategoryModel);
	}

}
