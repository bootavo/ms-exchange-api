package com.exchange.api.service;
import com.exchange.api.model.Response;

public interface ExchangeInterface {

    Response getExchange(double amount, String currency_in, String currency_out);
}
