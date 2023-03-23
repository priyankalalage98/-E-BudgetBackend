package Budget.Dto;

import java.util.List;

import Budget.Model.FindAllVendorModel;
import lombok.Data;

@Data
public class VendorDto {
	private String vendorName;
	private String contactNumber;
	private String email;
	private String address;
	
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public List<FindAllVendorModel> getVendorName() {
//		return vendorName;
//	}
//	public void setVendorName(List<FindAllVendorModel> vendorName) {
//		this.vendorName = vendorName;
//	}
	
	
	public String getContactNumber() {
		return contactNumber;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

		}