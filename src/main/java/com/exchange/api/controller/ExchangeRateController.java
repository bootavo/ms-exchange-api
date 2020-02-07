package com.exchange.api.controller;
import com.exchange.api.model.Response;
import com.exchange.api.model.ExchangeRate;
import com.exchange.api.service.ExchangeRateInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class ExchangeRateController {

	@Autowired
	private ExchangeRateInterface _exRateService;

	@PostMapping("v1/exchange-rate")
	public Response save(@RequestBody ExchangeRate exchange) {
		return _exRateService.saveExchangeRate(exchange);
	}

	@GetMapping("v1/exchange-rate")
	public Response get() {
		return _exRateService.getAllExchangeRates();
	}

	@PatchMapping("v1/exchange-rate/{id}")
	public Response udpate(@PathVariable(value="id") int id, @RequestBody ExchangeRate exchange) {
		return _exRateService.updateExchangeRate(exchange, id);
	}

}
