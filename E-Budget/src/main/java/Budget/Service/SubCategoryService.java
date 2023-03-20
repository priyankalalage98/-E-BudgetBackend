package Budget.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import Budget.Dto.SubCategoryDto;
import Budget.Model.SubCategoryModel;
import Budget.Repository.SubCategoryRepository;
@Service
public class SubCategoryService {

	@Autowired
	private SubCategoryRepository subCategoryRepository;
	
	public  ResponseEntity<SubCategoryModel> addSubCategory(SubCategoryDto subCategoryDto) {
		
		SubCategoryModel subCategoryModel = new SubCategoryModel();
		
		subCategoryModel.setSubCategoryDescription(subCategoryDto.getSubCategoryDescription());
		subCategoryModel=subCategoryRepository.save(subCategoryModel);
		
	
		
		return new ResponseEntity<>(subCategoryModel,HttpStatus.OK);
//		return new ResponseEntity<>(subCategoryModel.getId(),HttpStatus.OK);
//		return subCategoryModel.getSubCategoryDescription();
	
	}
}
