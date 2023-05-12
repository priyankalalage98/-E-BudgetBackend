package Budget.Service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import Budget.Dto.PODto;
import Budget.Model.POModel;
import Budget.Repository.PORepository;

@Service
public class POService {

	@Autowired
	private PORepository poRepository;

	public Object FindAll() {
		return poRepository.findAll();

	}

	public ResponseEntity<POModel> addPO(PODto poDto) {
		POModel poModel = new POModel();
		poModel.setBudgetCode(poDto.getBudgetCode());
		poModel.setPoStage(poDto.getPoStage());
		poModel.setVendorCompanyName(poDto.getVendorCompanyName());
		poModel.setPoAmount(poDto.getPoAmount());
		poModel.setPoDescription(poDto.getPoDescription());
		poModel.setPoExpiryDate(poDto.getPoExpiryDate());
		poModel.setPoDate(poDto.getPoDate());
		poModel.setPoNumber(poDto.getPoNumber());
		poModel = poRepository.save(poModel);
		return new ResponseEntity<>(poModel, HttpStatus.OK);
	}
}
