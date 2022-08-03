package br.com.sartori.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sartori.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
