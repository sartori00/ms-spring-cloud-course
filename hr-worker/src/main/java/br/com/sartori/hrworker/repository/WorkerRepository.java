package br.com.sartori.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sartori.hrworker.model.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
