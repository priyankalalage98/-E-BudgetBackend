package Budget.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Budget.Model.FindAllVendorModel;

@Repository
public interface FindAllVendorRepository extends JpaRepository<FindAllVendorModel, Long>{

}
