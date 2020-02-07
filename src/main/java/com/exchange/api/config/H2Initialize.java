package com.exchange.api.config;
import com.exchange.api.service.ExchangeRateInterface;
import com.exchange.api.model.ExchangeRate;
import com.exchange.api.util.DateHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import static com.exchange.api.util.Constants.*;

@Component
public class H2Initialize {

    @Autowired
    private ExchangeRateInterface _exRateService;

    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
        List<ExchangeRate> list = new ArrayList<ExchangeRate>();
        ExchangeRate dollar = new ExchangeRate("USD", "Dollar", 1, 0.91, 3.37, 18.66, 109.92, 0.77, DateHelper.getCurrentDate(), AUTHOR);
        ExchangeRate euro = new ExchangeRate("EUR", "Euro", 1.10, 1, 3.70, 20.49, 120.72, 0.85, DateHelper.getCurrentDate(), AUTHOR);
        ExchangeRate pen = new ExchangeRate("PEN", "Nuevo Sol", 0.30, 0.27, 1, 5.54, 32.65, 0.23, DateHelper.getCurrentDate(), AUTHOR);
        ExchangeRate pesos = new ExchangeRate("MXN", "Peso Mexicano", 0.054, 0.049, 0.18, 1, 5.89, 0.041, DateHelper.getCurrentDate(), AUTHOR);
        ExchangeRate yen = new ExchangeRate( "JPY", "Yen Japones",0.0091, 0.0083, 0.031, 0.17, 1, 0.0070, DateHelper.getCurrentDate(), AUTHOR);
        ExchangeRate pounds = new ExchangeRate("JPY", "Yen Japones", 1.29, 0.91, 4.36, 24.14, 142.19, 1, DateHelper.getCurrentDate(), AUTHOR);

        list.add(dollar);
        list.add(euro);
        list.add(pen);
        list.add(pesos);
        list.add(yen);
        list.add(pounds);

        _exRateService.saveExchangeRates(list);
    }

}
