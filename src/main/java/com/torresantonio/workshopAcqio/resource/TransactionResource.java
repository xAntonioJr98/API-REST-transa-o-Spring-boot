package com.torresantonio.workshopAcqio.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.torresantonio.workshopAcqio.entities.Transaction;
import com.torresantonio.workshopAcqio.services.TransactionService;

@RestController
@RequestMapping(value = "/transactions")
public class TransactionResource {
	
	@Autowired
	private TransactionService service;
	
	@GetMapping
	public ResponseEntity<List<Transaction>> listarTudo() {
		List<Transaction> List = service.listarTudo();
		return ResponseEntity.ok().body(List);

	}
	//obter as transações pelo id
	@GetMapping(value ="/{id}")
	public ResponseEntity<Transaction> findById(@PathVariable Long id){
		Transaction obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
			
	}
	//inserção de transações
	@PostMapping
	public ResponseEntity<Transaction> insert(@RequestBody Transaction obj){
		obj =service.insert(obj);
		return ResponseEntity.ok().body(obj);
			
	}
	//update de transações 
	@PutMapping(value ="/{id}")
	public ResponseEntity<Transaction> update(@PathVariable Long id, @RequestBody Transaction obj){
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
		
		
		
		
		
		
		
		
		
	}
	
}
