package com.exchange.api.util;

import com.exchange.api.model.ExchangeRate;
import static com.exchange.api.util.Constants.*;

public class ExchangeHelper {

    public static boolean validateCurrency(String currency_in){

        boolean result = false;

        result = (currency_in.equals(USD) ||
                    currency_in.equals(EUR) ||
                        currency_in.equals(PEN) ||
                            currency_in.equals(MXN) ||
                                currency_in.equals(JPY) ||
                                    currency_in.equals(GBP));

        return result;

    }

    public static double getRateOut(ExchangeRate item, String currency_in){
        double rate = 0;
        switch(currency_in){
            case USD:
                rate = item.usd_rate;
                break;
            case EUR:
                rate = item.eur_rate;
                break;
            case PEN:
                rate = item.pen_rate;
                break;
            case MXN:
                rate = item.mxn_rate;
                break;
            case JPY:
                rate = item.jpy_rate;
                break;
            case GBP:
                rate = item.gbp_rate;
                break;
            default:
                    rate = 0;
                    break;
        }

        return rate;

    }

    public static double convertAmount(ExchangeRate item, String currency_in, String currency_out, double amount){

        double result = 0;

        try {

            if(!validateCurrency(currency_in))
                throw new Exception(currency_in+" doesn't a valid currency");

            if(!validateCurrency(currency_out))
                throw new Exception(currency_in+" doesn't a valid currency");

            double rate = getRateOut(item, currency_out);
            result = amount*rate;

        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }finally {
            return result;
        }

    }

}
