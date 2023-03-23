package Budget.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Budget.Model.FindAllBudgetCategoryModel;

@Repository
public interface FindAllBudgetCategoryRepository extends JpaRepository<FindAllBudgetCategoryModel, Long>{

}
