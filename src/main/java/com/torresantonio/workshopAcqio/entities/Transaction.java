package com.torresantonio.workshopAcqio.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.torresantonio.workshopAcqio.entities.enums.CardApplication;
import com.torresantonio.workshopAcqio.entities.enums.PaymentStatus;

@Entity
public class Transaction implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Date date;
	private int momento;
	private BigDecimal value;
	private CardApplication cardApplication;
	private PaymentStatus paymentStatus;

	public Transaction() {

	}

	public Transaction(long id, Date date, int momento, CardApplication cardApplication,PaymentStatus paymentStatus, BigDecimal value) {
		super();
		this.id = id;
		this.date = date;
		this.momento = momento;
		this.cardApplication = cardApplication;
		this.paymentStatus = paymentStatus;
		this.value = value;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public int getMomento() {
		return momento;
	}

	public void setMomento(int momento) {
		this.momento = momento;
	}

	public CardApplication getCardApplication() {
		return cardApplication;
	}

	public void setCardApplication(CardApplication cardApplication) {
		this.cardApplication = cardApplication;
	}

	public PaymentStatus getpaymentStatus() {
		return paymentStatus;
	}

	public void setpaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
