package Budget.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import Budget.Dto.FindAllVendorDto;
import Budget.Model.FindAllVendorModel;
import Budget.Repository.FindAllVendorRepository;

@Service
public class FindAllVendorService {
	@Autowired
	private FindAllVendorRepository findAllVendorRepository;
	
	public Object findAll() {
		return findAllVendorRepository.findAll();
		
	}
	
	public Object addVendor(FindAllVendorDto findAllVendorDto) {
		FindAllVendorModel findAllVendorModel = new FindAllVendorModel();
		findAllVendorModel.setVendorName(findAllVendorDto.getVendorName());
		findAllVendorModel =findAllVendorRepository.save(findAllVendorModel);
		return new ResponseEntity<>(findAllVendorModel.getId(),HttpStatus.OK);
	}

}
