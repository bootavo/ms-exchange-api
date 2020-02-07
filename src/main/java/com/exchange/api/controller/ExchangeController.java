package com.exchange.api.controller;
import com.exchange.api.model.Response;
import com.exchange.api.service.ExchangeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class ExchangeController {

	@Autowired
	private ExchangeInterface _exService;

	@GetMapping("v1/exchange/amount/{amount}/currency-in/{currency_in}/currency-out/{currency_out}")
	public Response get(@PathVariable double amount,
						@PathVariable(value="currency_in") String currency_in,
						@PathVariable(value="currency_out") String currency_out) {

		return _exService.getExchange(amount, currency_in, currency_out);
	}

}
