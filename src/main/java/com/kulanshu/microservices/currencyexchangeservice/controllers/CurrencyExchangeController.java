package com.kulanshu.microservices.currencyexchangeservice.controllers;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kulanshu.microservices.currencyexchangeservice.beans.ExchangeValue;
import com.kulanshu.microservices.currencyexchangeservice.repo.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {

	@Autowired
	public Environment env;
	
	@Autowired
	public ExchangeValueRepository repository;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from,@PathVariable String to) {
		
		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
		exchangeValue.setPort(env.getProperty("local.server.port"));
		return exchangeValue;
	}
}
