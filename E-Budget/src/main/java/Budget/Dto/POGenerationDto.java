package Budget.Dto;


import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;


import Budget.Model.BudgetCategoryModel;
import Budget.Model.VendorModel;
import lombok.Data;

@Data
public class POGenerationDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	
	private String poStage;
	private String poNumber;
	private Date poDate;

//	@OneToMany(cascade = CascadeType.ALL)
//	private Set<VendorModel> vendorModel;

	private String vendorCompanyName;

	public String getVendorCompanyName() {
		return vendorCompanyName;
	}
	public void setVendorCompanyName(String vendorCompanyName) {
		this.vendorCompanyName = vendorCompanyName;
	}

	private String budgetCode;
	private String poAmount;
	private String poDescription;
	private Date poExpiryDate;

	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getPoStage() {
		return poStage;
	}

	public void setPoStage(String poStage) {
		this.poStage = poStage;
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

	
	public String getBudgetCode() {
		return budgetCode;
	}

	public void setBudgetCode(String budgetCode) {
		this.budgetCode = budgetCode;
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

}
