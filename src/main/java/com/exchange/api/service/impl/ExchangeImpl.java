package com.exchange.api.service.impl;
import com.exchange.api.model.ExchangeRate;
import com.exchange.api.model.Response;
import com.exchange.api.model.Exchange;
import com.exchange.api.repository.ExchangeRateRepository;
import com.exchange.api.service.ExchangeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import static com.exchange.api.util.ExchangeHelper.*;
import static com.exchange.api.util.DateHelper.*;
import static com.exchange.api.util.NamingHelper.getMethodName;
import static com.exchange.api.util.ResponseHelper.*;
import static com.exchange.api.util.Constants.*;

@Service
public class ExchangeImpl implements ExchangeInterface {

    @Autowired
    private ExchangeRateRepository repositoryRate;

    @Override
    public Response getExchange(double amount, String currency_in, String currency_out) {

        try{
            ExchangeRate exchangeRate = repositoryRate.findByLabel(currency_in);

            double final_amount = convertAmount(exchangeRate, currency_in, currency_out, amount);
            Exchange exchange = new Exchange(amount, currency_in, currency_out, final_amount, getCurrentDate());

            List<Exchange> listExchange = new ArrayList<Exchange>(); listExchange.add(exchange);
            List<Object> data = (List<Object>) (Object) listExchange;

            return buildOk(data, getMethodName(), HTTP_GET);

        }catch(Exception ex){
            return buildConflicts(getMethodName(), HTTP_GET);

        }

    }
}
