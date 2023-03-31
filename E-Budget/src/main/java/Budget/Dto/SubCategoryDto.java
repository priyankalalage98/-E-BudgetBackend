package Budget.Dto;

import lombok.Data;

@Data
public class SubCategoryDto {
	
	private int id;
	private String budgetCode;
	private String remark;
	private String Active;
	private String budgetType;
	private String budgetSubCategoryName;
	
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
	public String getActive() {
		return Active;
	}
	public void setActive(String active) {
		Active = active;
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
