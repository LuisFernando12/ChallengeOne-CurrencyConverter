package br.com.luis.fernando.utils;

import br.com.luis.fernando.models.CurrencyRecord;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Serialize {
    private Serialize(){
    }
    public static CurrencyRecord serializeFromJson(String json){
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).setPrettyPrinting().create();
        var currencyRecord = gson.fromJson(json, CurrencyRecord.class);
        return currencyRecord;
    }
}
