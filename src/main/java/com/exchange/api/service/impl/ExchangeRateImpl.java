package com.exchange.api.service.impl;
import com.exchange.api.model.Response;
import com.exchange.api.service.ExchangeRateInterface;
import com.exchange.api.util.NullAwareBeanUtilsBean;
import com.exchange.api.model.ExchangeRate;
import com.exchange.api.repository.ExchangeRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import static com.exchange.api.util.Constants.*;
import static com.exchange.api.util.NamingHelper.getMethodName;
import static com.exchange.api.util.ResponseHelper.buildConflicts;
import static com.exchange.api.util.ResponseHelper.buildOk;

@Service
public class ExchangeRateImpl extends NullAwareBeanUtilsBean implements ExchangeRateInterface {

    @Autowired
    private ExchangeRateRepository repository;

    @Override
    public Response updateExchangeRate(ExchangeRate request, int id) {

        try{
            ExchangeRate olddData = repository.findById(id).get();

            if(olddData != null){
                copyProperties(olddData, request);
                repository.save(olddData);

            }

            return buildOk(null, getMethodName(), HTTP_PATCH);

        }catch(Exception ex){
            return buildConflicts(getMethodName(), HTTP_PATCH);

        }

    }

    public Response saveExchangeRate(ExchangeRate request) {

        try{
            ExchangeRate exchangeRate = repository.save(request);
            return buildOk(null, getMethodName(), HTTP_POST);

        }catch(Exception ex){
            return buildConflicts(getMethodName(), HTTP_POST);

        }

    }

    @Override
    public Response saveExchangeRates(List<ExchangeRate> request) {

        try{
            List<ExchangeRate> exchangeRate = repository.saveAll(request);
            return buildOk(null, getMethodName(), HTTP_POST);

        }catch(Exception ex){
            return buildConflicts(getMethodName(), HTTP_POST);

        }

    }

    @Override
    public Response getAllExchangeRates() {
        try{
            List<ExchangeRate> result = repository.findAll();
            List<Object> data = (List<Object>) (Object) result;

            return buildOk(data, getMethodName(), HTTP_GET);

        }catch(Exception ex){
            return buildConflicts(getMethodName(), HTTP_GET);

        }

    }

}
