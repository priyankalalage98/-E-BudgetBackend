package Budget.Dto;

import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class VendorDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private int id;
	private String vendorCompanyName;
	private String email;
	private String address;
	private String vendorSapCode;
	private String contactPersonName;
	private String mobileNumber;;
	private String landLineNumber;

	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	public ZonedDateTime getActivation_date() {
		return activation_date;
	}

	public void setActivation_date(ZonedDateTime activation_date) {
		this.activation_date = activation_date;
	}

	private ZonedDateTime activation_date = ZonedDateTime.now();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVendorCompanyName() {
		return vendorCompanyName;
	}

	public void setVendorCompanyName(String vendorCompanyName) {
		this.vendorCompanyName = vendorCompanyName;
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

	public String getVendorSapCode() {
		return vendorSapCode;
	}

	public void setVendorSapCode(String vendorSapCode) {
		this.vendorSapCode = vendorSapCode;
	}

	public String getContactPersonName() {
		return contactPersonName;
	}

	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getLandLineNumber() {
		return landLineNumber;
	}

	public void setLandLineNumber(String landLineNumber) {
		this.landLineNumber = landLineNumber;
	}

}