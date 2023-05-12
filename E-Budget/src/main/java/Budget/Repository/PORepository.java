package Budget.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Budget.Model.POModel;

public interface PORepository extends JpaRepository<POModel, Integer> {

}
