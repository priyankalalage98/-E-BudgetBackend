package Budget.Dto;

import java.time.ZonedDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

import Budget.Model.BudgetCategoryModel;
import Budget.Model.SubCategoryModel;
import lombok.Data;

@Data
public class BudgetCreationDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private int id;
	private String remark;
	private String budgetType;
	private String amount;
	private String amountInWords;

	public String getAmountInWords() {
		return amountInWords;
	}

	public void setAmountInWords(String amountInWords) {
		this.amountInWords = amountInWords;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBudgetType() {
		return budgetType;
	}

	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}

	private String budgetCategoryName;
//	  Mapping to the other table
	@OneToMany(cascade = CascadeType.ALL)
	private Set<BudgetCategoryModel> BudgetCategory;

	public String getBudgetCategoryName() {
		return budgetCategoryName;
	}

	public void setBudgetCategoryName(String budgetCategoryName) {
		this.budgetCategoryName = budgetCategoryName;
	}

	private String budgetSubCategoryName;
//	  Mapping to the other table
	@OneToMany(cascade = CascadeType.ALL)
	private Set<SubCategoryModel> subCategory;

	public String getBudgetSubCategoryName() {
		return budgetSubCategoryName;
	}

	public void setBudgetSubCategoryName(String budgetSubCategoryName) {
		this.budgetSubCategoryName = budgetSubCategoryName;
	}

	private String budgetCode;
//	  Mapping to the other table
	@OneToMany(cascade = CascadeType.ALL)
	private Set<SubCategoryModel> BudgetCode;

	public String getBudgetCode() {
		return budgetCode;
	}

	public void setBudgetCode(String budgetCode) {
		this.budgetCode = budgetCode;
	}

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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
