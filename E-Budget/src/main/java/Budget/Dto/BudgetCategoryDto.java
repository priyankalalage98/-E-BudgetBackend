package Budget.Dto;

import lombok.Data;

@Data
public class BudgetCategoryDto {
	
	
	private String budgetCategoryName;
	private String budgetCategoryDescription;
	
	
	public String getBudgetCategoryName() {
		return budgetCategoryName;
	}
	public void setBudgetCategoryName(String budgetCategoryName) {
		this.budgetCategoryName = budgetCategoryName;
	}
	public String getBudgetCategoryDescription() {
		return budgetCategoryDescription;
	}
	public void setBudgetCategoryDescription(String budgetCategoryDescription) {
		this.budgetCategoryDescription = budgetCategoryDescription;
	}
	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}


	
	
	
}
	