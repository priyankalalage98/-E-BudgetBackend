package Budget.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import Budget.Dto.InvoiceDto;
import Budget.Model.InvoiceModel;
import Budget.Repository.InvoiceRepository;

@Service
public class InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepository;
	InvoiceModel invoiceModel = new InvoiceModel();

	public Object findAll() {

		return invoiceRepository.findAll();
	}

	public ResponseEntity<InvoiceModel> addInvoice(@RequestBody InvoiceDto invoiceDto) {
		invoiceModel.setPoNumber(invoiceDto.getPoNumber());
		invoiceModel.setInvoiceNumber(invoiceDto.getInvoiceNumber());
		invoiceModel.setInvoiceAmount(invoiceDto.getInvoiceAmount());
		invoiceModel.setInvoiceDate(invoiceDto.getInvoiceDate());
		invoiceModel.setTax(invoiceDto.getTax());
		invoiceModel.setRemark(invoiceDto.getRemark());
		invoiceModel.setInvoiceReceivedDate(invoiceDto.getInvoiceReceivedDate());
		invoiceModel.setSendEmail(invoiceDto.getSendEmail());
		invoiceModel = invoiceRepository.save(invoiceModel);
		return new ResponseEntity<>(invoiceModel, HttpStatus.OK);
	}

}
