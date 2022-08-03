package br.com.sartori.hruser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sartori.hruser.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
