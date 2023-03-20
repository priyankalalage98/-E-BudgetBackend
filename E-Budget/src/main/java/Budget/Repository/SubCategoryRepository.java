package Budget.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Budget.Model.SubCategoryModel;

@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategoryModel, Integer> {

//	SubCategoryModel findBySubCategoryDescription(String SubCategoryDescription);
}
