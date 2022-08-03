package br.com.sartori.hrpayroll.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import br.com.sartori.hrpayroll.model.Payment;
import br.com.sartori.hrpayroll.services.PaymentService;

@RefreshScope
@RestController
@RequestMapping("/payments")
public class PaymentController {
	
	private static Logger logger = LoggerFactory.getLogger(PaymentController.class);
	
	@Value("${test.config}")
	private String testConfig;
	
	@Autowired
	private PaymentService service;
	
	@GetMapping(value = "/configs")
	public ResponseEntity<Void> getConfigs(){
		logger.info("Config = " + testConfig);
		return ResponseEntity.noContent().build();
	}
	
	@HystrixCommand(fallbackMethod = "getPaymentAlternative")
	@GetMapping(value = "/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days ){
		return ResponseEntity.ok(service.getPayment(workerId, days));
	}
	
	public ResponseEntity<Payment> getPaymentAlternative(Long workerId, Integer days ){
		return ResponseEntity.ok(new Payment("Fulano", 100.0, days));
	}
	
	

}
