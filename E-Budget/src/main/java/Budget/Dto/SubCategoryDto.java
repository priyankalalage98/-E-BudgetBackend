package Budget.Dto;

import lombok.Data;

@Data
public class SubCategoryDto {
private  String subCategoryDescription;

public String getSubCategoryDescription() {
	return subCategoryDescription;
}

public void setSubCategoryDescription(String subCategoryDescription) {
	this.subCategoryDescription = subCategoryDescription;
}

		}
