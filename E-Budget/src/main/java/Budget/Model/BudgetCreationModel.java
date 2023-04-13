package Budget.Model;

import java.time.ZonedDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;
import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "BudgetCreationMaster")
public class BudgetCreationModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int budgetCode;
	private String capitalAmount;
	private String revenueAmount;
	private String remark;
	
	
	
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

	private String budgetCategoryDescription;

	public int getBudgetCode() {
		return budgetCode;
	}

	public void setBudgetCode(int budgetCode) {
		this.budgetCode = budgetCode;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
