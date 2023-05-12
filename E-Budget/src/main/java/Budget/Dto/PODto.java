package Budget.Dto;

import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
public class PODto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private int id;
	private String budgetCode;
	private String poStage;
	private String vendorCompanyName;
	private String poAmount;
	private String poDescription;
	private Date poExpiryDate;
	private String poNumber;
	private Date poDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBudgetCode() {
		return budgetCode;
	}

	public void setBudgetCode(String budgetCode) {
		this.budgetCode = budgetCode;
	}

	public String getPoStage() {
		return poStage;
	}

	public void setPoStage(String poStage) {
		this.poStage = poStage;
	}

	public String getVendorCompanyName() {
		return vendorCompanyName;
	}

	public void setVendorCompanyName(String vendorCompanyName) {
		this.vendorCompanyName = vendorCompanyName;
	}

	public String getPoAmount() {
		return poAmount;
	}

	public void setPoAmount(String poAmount) {
		this.poAmount = poAmount;
	}

	public String getPoDescription() {
		return poDescription;
	}

	public void setPoDescription(String poDescription) {
		this.poDescription = poDescription;
	}

	public Date getPoExpiryDate() {
		return poExpiryDate;
	}

	public void setPoExpiryDate(Date poExpiryDate) {
		this.poExpiryDate = poExpiryDate;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public Date getPoDate() {
		return poDate;
	}

	public void setPoDate(Date poDate) {
		this.poDate = poDate;
	}

}
