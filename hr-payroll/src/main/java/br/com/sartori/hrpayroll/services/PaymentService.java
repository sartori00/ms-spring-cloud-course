package br.com.sartori.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import br.com.sartori.hrpayroll.feignclients.WorkerFeignClient;
import br.com.sartori.hrpayroll.model.Payment;
import br.com.sartori.hrpayroll.model.Worker;

@RefreshScope
@Service
public class PaymentService {
	
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		Worker worker = workerFeignClient.findById(workerId).getBody();
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
