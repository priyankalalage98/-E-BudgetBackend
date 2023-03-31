package Budget.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Budget.Model.BudgetCreationModel;

@Repository
public interface BudgetCreationRepository extends JpaRepository<BudgetCreationModel, Integer> {

}
