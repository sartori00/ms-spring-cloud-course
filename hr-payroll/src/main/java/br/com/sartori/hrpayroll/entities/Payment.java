package br.com.sartori.hrpayroll.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Payment implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String name;
	private Double dailyIncome;
	private Integer days;
	
	public Payment() {}
	
	
	public double getTotal() {
		return this.days * this.dailyIncome;
	}

}
