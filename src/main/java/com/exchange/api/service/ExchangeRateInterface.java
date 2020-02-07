package com.exchange.api.service;
import com.exchange.api.model.Response;
import com.exchange.api.model.ExchangeRate;

import java.util.List;

public interface ExchangeRateInterface {

    Response updateExchangeRate(ExchangeRate request, int id);
    Response saveExchangeRate(ExchangeRate request);
    Response saveExchangeRates(List<ExchangeRate> request);
    Response getAllExchangeRates();
}
