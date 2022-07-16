package com.kulanshu.microservices.currencyexchangeservice.beans;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExchangeValue {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private int id;
	
	@Column(name="CURRENCY_FROM")
	private String from;
	
	@Column(name="CURRENCY_TO")
	private String to;
	
	@Column(name="CONVERSION_RATE")
	private int conversion;
	
	@Column(name="PORT")
	private String port;
	
	public ExchangeValue() {
		
	}
	public ExchangeValue(int id, String from, String to, int conversion) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversion = conversion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getConversion() {
		return conversion;
	}

	public void setConversion(int conversion) {
		this.conversion = conversion;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	
	
	
}
