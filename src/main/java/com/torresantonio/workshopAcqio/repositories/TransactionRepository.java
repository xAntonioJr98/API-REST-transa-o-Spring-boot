package com.torresantonio.workshopAcqio.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.torresantonio.workshopAcqio.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

	

	
}
