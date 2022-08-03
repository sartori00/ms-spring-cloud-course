package br.com.sartori.hroauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.sartori.hroauth.model.User;
import br.com.sartori.hroauth.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping("/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email){
		try {
			return ResponseEntity.ok(service.findByEmail(email));
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}
	}
	
}
