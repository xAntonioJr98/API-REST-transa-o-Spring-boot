package com.torresantonio.workshopAcqio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torresantonio.workshopAcqio.entities.Transaction;
import com.torresantonio.workshopAcqio.repositories.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepository repository;

	public List<Transaction> listarTudo() {
		return repository.findAll();

	}

	public Transaction findById(long id) {
		Optional<Transaction> obj = repository.findById(id);
		return obj.get();

	}

	public Transaction insert(Transaction obj) {
		return repository.save(obj);

	}
	
	public Transaction update(Long id, Transaction obj) {
		Transaction entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
		
		
	}

	private void updateData(Transaction entity, Transaction obj) {
		entity.setMomento(obj.getMomento());
		entity.setValue(obj.getValue());
		entity.setCardApplication(obj.getCardApplication());
		entity.setpaymentStatus(obj.getpaymentStatus());
		
		
	}
}
