package com.torresantonio.workshopAcqio.config;


import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.torresantonio.workshopAcqio.entities.Transaction;
import com.torresantonio.workshopAcqio.entities.enums.CardApplication;
import com.torresantonio.workshopAcqio.entities.enums.PaymentStatus;
import com.torresantonio.workshopAcqio.repositories.TransactionRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private TransactionRepository transactionRepository;

	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		
		Transaction t1 = new Transaction(1, sdf.parse("01/01/2019 "), 1313, CardApplication.CREDITO, PaymentStatus.SUCCESS, new BigDecimal(100.00));
		Transaction t2 = new Transaction(2, sdf.parse("01/01/2019 "),1313, CardApplication.DEBITO, PaymentStatus.PENDING, new BigDecimal(300.00));
		
		transactionRepository.saveAll(Arrays.asList(t1, t2));
		
		
		
	}
	
}
