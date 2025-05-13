package br.com.luis.fernando.models;

import br.com.luis.fernando.env.Env;
import br.com.luis.fernando.exceptions.CurrencyException;
import br.com.luis.fernando.http.Http;
import br.com.luis.fernando.utils.Serialize;

public class Currency implements ICurrency {
    @Override
    public double convertion(String currency, String currencyConverter) {
        var uri = Env.get("BASE_URL")+"/pair/"+currency+"/"+currencyConverter;
        var responseApi = new Http().get(uri);
        CurrencyRecord currencyRecord = Serialize.serializeFromJson(responseApi);
        if (currencyRecord.result().equals("success")){
            return currencyRecord.conversionRate();
        }
        throw new CurrencyException("Error calling Coin API");
    }
}
