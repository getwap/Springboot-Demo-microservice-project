package com.micro.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.micro.currencyexchangeservice.model.ExchangeValue;

@RestController
public class CurrenctExchangeController {
	
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeValu (@PathVariable String from, @PathVariable String to) {
		
		
		return new ExchangeValue(1000,"usd","BIRR",BigDecimal.valueOf(70));
}

}