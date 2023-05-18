package Budget.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Budget.Model.BudgetCategoryModel;

@Repository
public interface BudgetCategoryRepository extends JpaRepository<BudgetCategoryModel, Integer> {

	
}
