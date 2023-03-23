package Budget.Dto;

import lombok.Data;

@Data


public class FindAllBudgetCategoryDto {

	
	private Long id;
	private String budgetCategoryName;
	
	public String getBudgetCategoryName() {
		return budgetCategoryName;
	}
	public void setBudgetCategoryName(String budgetCategoryName) {
		this.budgetCategoryName = budgetCategoryName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
}