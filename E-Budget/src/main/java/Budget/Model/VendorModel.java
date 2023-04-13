package Budget.Model;

import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "VendorMaster")
public class VendorModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
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
//	@CreatedDate
//	private Date CreatedDate =new Date(System.currentTimeMillis());
//	public Date getCreatedDate() {
//		return CreatedDate;
//	}
//	private  LocalTime time = LocalTime.now();
//	public LocalTime getTime() {
//		return time;
//	}
//
//	public void setTime(LocalTime time) {
//		this.time = time;
//	}
//
//	public void setCreatedDate(Date createdDate) {
//		CreatedDate = createdDate;
//	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
	// @ManyToMany(cascade = CascadeType.ALL)

}
