package Budget.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import Budget.Model.VendorModel;

@Repository
public interface VendorRepository  extends JpaRepository<VendorModel, Integer>{

//	SubCategoryModel findBySubCategoryDescription(String SubCategoryDescription);
}
