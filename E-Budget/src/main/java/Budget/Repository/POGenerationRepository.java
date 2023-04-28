package Budget.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Budget.Model.POGenerationModel;
@Repository
public interface POGenerationRepository extends JpaRepository<POGenerationModel, Integer> {

}
