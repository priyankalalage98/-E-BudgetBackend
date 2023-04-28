package Budget.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import Budget.Dto.BudgetCategoryDto;
import Budget.Dto.POGenerationDto;
import Budget.Model.BudgetCategoryModel;
import Budget.Model.POGenerationModel;
import Budget.Repository.BudgetCategoryRepository;
import Budget.Repository.POGenerationRepository;
@Service
public class POGenerationService {

	@Autowired
	private POGenerationRepository poGenerationRepository;
	
	
	
	public ResponseEntity<POGenerationModel> addPO(POGenerationDto poGenerationDto) {

		POGenerationModel poGenerationModel = new POGenerationModel();

		poGenerationModel.setPoStage(poGenerationDto.getPoStage());
		poGenerationModel.setPoNumber(poGenerationDto.getPoAmount());
		poGenerationModel.setPoDate(poGenerationDto.getPoDate());
		poGenerationModel.setVendorCompanyName(poGenerationDto.getVendorCompanyName());
		poGenerationModel.setBudgetCode(poGenerationDto.getBudgetCode());
		poGenerationModel.setPoAmount(poGenerationDto.getPoAmount());
		poGenerationModel.setPoDescription(poGenerationDto.getPoDescription());
		poGenerationModel.setPoExpiryDate(poGenerationDto.getPoExpiryDate());
		poGenerationModel = poGenerationRepository.save(poGenerationModel);

		return new ResponseEntity<>(poGenerationModel, HttpStatus.OK);
		

	}



	public Object findAll() {
		return poGenerationRepository.findAll();
	}
	

	
	
}
