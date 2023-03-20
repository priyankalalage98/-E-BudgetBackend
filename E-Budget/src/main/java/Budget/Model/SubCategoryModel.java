package Budget.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "SubCategory")
public class SubCategoryModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String SubCategoryDescription;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSubCategoryDescription() {
		return SubCategoryDescription;
	}

	public void setSubCategoryDescription(String subCategoryDescription) {
		SubCategoryDescription = subCategoryDescription;
	}

}
