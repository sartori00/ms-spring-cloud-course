package br.com.sartori.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sartori.hrpayroll.entities.Payment;
import br.com.sartori.hrpayroll.services.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentResouces {
	
	@Autowired
	private PaymentService service;
	
	@GetMapping(value = "/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days ){
		return ResponseEntity.ok(service.getPayment(workerId, days));
	}
	

}
