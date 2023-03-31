package Budget.Dto;

import lombok.Data;

@Data
public class BudgetCreationDto {
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	private int id;
	private int budgetCode;
	private String capitalAmount;
	private String revenueAmount;
	private String Remark;
	private String budgetCategoryDescription;

	public String getCapitalAmount() {
		return capitalAmount;
	}


	public void setCapitalAmount(String capitalAmount) {
		this.capitalAmount = capitalAmount;
	}


	public String getRevenueAmount() {
		return revenueAmount;
	}


	public void setRevenueAmount(String revenueAmount) {
		this.revenueAmount = revenueAmount;
	}

	
	public String getBudgetCategoryDescription() {
		return budgetCategoryDescription;
	}


	public void setBudgetCategoryDescription(String budgetCategoryDescription) {
		this.budgetCategoryDescription = budgetCategoryDescription;
	}

	
	public int getBudgetCode() {
		return budgetCode;
	}


	public void setBudgetCode(int budgetCode) {
		this.budgetCode = budgetCode;
	}

	public String getRemark() {
		return Remark;
	}

	public void setRemark(String remark) {
		Remark = remark;
	}

	
}
