package br.com.sartori.hroauth.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String roleName;
	
	public Role() {}

}
