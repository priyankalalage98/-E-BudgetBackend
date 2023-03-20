package Budget.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import Budget.Dto.SubCategoryDto;
import Budget.Dto.VendorDto;
import Budget.Model.SubCategoryModel;
import Budget.Model.VendorModel;
import Budget.Repository.SubCategoryRepository;
import Budget.Repository.VendorRepository;
@Service
public class VendorService {

	@Autowired
	private VendorRepository vendorRepository;
	
	public  ResponseEntity<VendorModel> addVendor(VendorDto vendorDto) {
		
		VendorModel vendorModel = new VendorModel();
		
		vendorModel.setVendorName(vendorDto.getVendorName());
		vendorModel.setEmail(vendorDto.getEmail());
		vendorModel.setContactNumber(vendorDto.getContactNumber());
		vendorModel.setAddress(vendorDto.getAddress());
		vendorModel=vendorRepository.save(vendorModel);
		
	return new ResponseEntity<>(vendorModel,HttpStatus.OK);
//		return vendorModel;
	
	}
}
