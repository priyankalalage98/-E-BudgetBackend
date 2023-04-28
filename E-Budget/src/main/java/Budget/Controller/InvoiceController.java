package Budget.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Budget.Dto.BudgetCategoryDto;
import Budget.Dto.InvoiceDto;
import Budget.Service.BudgetCategoryService;
import Budget.Service.InvoiceService;

@RestController

//@CrossOrigin("http://10.44.33.127:4200")
@CrossOrigin("http://localhost:4200")

@RequestMapping("/invoice")
public class InvoiceController {
	@Autowired

	private InvoiceService invoiceService;

	@PostMapping("/addInvoice")

	public ResponseEntity addInvoice(@RequestBody InvoiceDto invoiceDto) {

		return ResponseEntity.ok(invoiceService.addInvoice(invoiceDto));
	}
	@GetMapping("/findAllInvoice")

	public ResponseEntity findAllInvoice() {
		return ResponseEntity.ok(invoiceService.findAll());
	}
}
