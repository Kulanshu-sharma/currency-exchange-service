package com.kulanshu.microservices.currencyexchangeservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kulanshu.microservices.currencyexchangeservice.beans.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Integer> {
     ExchangeValue findByFromAndTo(String from, String to);
}
