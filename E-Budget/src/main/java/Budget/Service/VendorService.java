package Budget.Service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import Budget.Dto.VendorDto;
import Budget.Model.VendorModel;
import Budget.Repository.VendorRepository;

@Service
public class VendorService {

	@Autowired
	private VendorRepository vendorRepository;

	public Object findAll() {
		return vendorRepository.findAll();

	}

	public ResponseEntity<VendorModel> addVendor(VendorDto vendorDto) {

		VendorModel vendorModel = new VendorModel();

		vendorModel.setVendorCompanyName(vendorDto.getVendorCompanyName());
		vendorModel.setEmail(vendorDto.getEmail());
		vendorModel.setAddress((vendorDto.getAddress()));
		vendorModel.setVendorSapCode(vendorDto.getVendorSapCode());
		vendorModel.setContactPersonName(vendorDto.getContactPersonName());
		vendorModel.setMobileNumber(vendorDto.getMobileNumber());
		vendorModel.setLandLineNumber(vendorDto.getLandLineNumber());
		vendorModel = vendorRepository.save(vendorModel);

		return new ResponseEntity<>(vendorModel, HttpStatus.OK);

	}

	public Optional<VendorModel> findById(long id) {
		return vendorRepository.findById((int) id);
	}

	public void deleteVendor(long id) {
		vendorRepository.deleteById((int) id);
	}

	public VendorModel updateVendor(VendorModel vendorModel) {
		
		return vendorRepository.save(vendorModel);
	}

}
