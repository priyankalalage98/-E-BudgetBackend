package Budget.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Budget.Model.InvoiceModel;
@Repository
public interface InvoiceRepository  extends JpaRepository<InvoiceModel, Integer> {

}
