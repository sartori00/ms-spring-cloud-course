package br.com.sartori.hrpayroll.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Worker implements Serializable{
	
	private static final long serialVersionUID = 1L;
	

	private Long id;
	
	private String  name;
	
	private Double dailyIncome;
	
	public Worker() {}
	

}
