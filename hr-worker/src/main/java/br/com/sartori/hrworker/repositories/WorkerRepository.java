package br.com.sartori.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sartori.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
