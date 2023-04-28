package Budget.Dto;

import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import Budget.Model.BudgetCategoryModel;
import Budget.Repository.SubCategoryRepository;
import lombok.Data;

@Data
public class SubCategoryDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private int id;
	private String budgetCode;
	private String remark;
	private boolean status;
	private String budgetType;
	@CreatedDate
	private String budgetSubCategoryName;

	private String budgetCategoryName;

//	  Mapping to the other table
	@OneToMany(cascade = CascadeType.ALL)
	private Set<BudgetCategoryModel> budgetCategoryModel;

	public String getBudgetCategoryName() {
		return budgetCategoryName;
	}

	public void setBudgetCategoryName(String budgetCategoryName) {
		this.budgetCategoryName = budgetCategoryName;
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

	public String getBudgetCode() {
		return budgetCode;
	}

	public void setBudgetCode(String budgetCode) {
		this.budgetCode = budgetCode;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getBudgetType() {
		return budgetType;
	}

	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}

	public String getBudgetSubCategoryName() {
		return budgetSubCategoryName;
	}

	public void setBudgetSubCategoryName(String budgetSubCategoryName) {
		this.budgetSubCategoryName = budgetSubCategoryName;
	}

}
