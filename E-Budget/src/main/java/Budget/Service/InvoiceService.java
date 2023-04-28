package Budget.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import Budget.Dto.InvoiceDto;
import Budget.Model.InvoiceModel;
import Budget.Repository.InvoiceRepository;
@Service
public class InvoiceService {
	@Autowired
	private InvoiceRepository invoiceRepository;

	

	public ResponseEntity<InvoiceModel> addInvoice(InvoiceDto invoiceDto) {

		InvoiceModel invoiceModel = new InvoiceModel();
		invoiceModel.setPoNumber(invoiceDto.getPoNumber());
		invoiceModel.setInvoiceNumber(invoiceDto.getInvoiceNumber());
		invoiceModel.setInvoiceDate(invoiceDto.getInvoiceDate());
		invoiceModel.setInvoiceAmount(invoiceDto.getInvoiceAmount());
		invoiceModel.setInvoiceReceivedDate(invoiceDto.getInvoiceReceivedDate());
		invoiceModel.setTax(invoiceDto.getTax());
		invoiceModel.setRemark(invoiceDto.getRemark());
		invoiceModel.setSendEmail(invoiceDto.getSendEmail());
		
		invoiceModel = invoiceRepository.save(invoiceModel);

		return new ResponseEntity<>(invoiceModel, HttpStatus.OK);
		

	}
	public Object findAll() {
		return invoiceRepository.findAll();
	}
	
}
