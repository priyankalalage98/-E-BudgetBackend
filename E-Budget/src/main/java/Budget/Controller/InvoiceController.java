package Budget.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Budget.Dto.InvoiceDto;
import Budget.Service.InvoiceService;

@RestController
@RequestMapping("/invoice")
@CrossOrigin("http://localhost:4200")
public class InvoiceController {

	@Autowired
	public InvoiceService invoiceService;

	@PostMapping("/addInvoice")
	public ResponseEntity addInvoice(@RequestBody InvoiceDto invoiceDto) {
		return ResponseEntity.ok(invoiceService.addInvoice(invoiceDto));
	}

	@GetMapping("findAllInvoice")
	public ResponseEntity findAllInvoice() {
		return ResponseEntity.ok(invoiceService.findAll());
	}

}
