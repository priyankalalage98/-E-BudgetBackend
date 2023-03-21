package Budget.Dto;

import lombok.Data;

@Data


public class FindAllVendorDto {

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	private Long id;
	private String vendorName;
	
}
