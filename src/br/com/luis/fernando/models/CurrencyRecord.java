package br.com.luis.fernando.models;

public record CurrencyRecord(String result, String timeLastUpdateUtc, String baseCode, String targetCode, double conversionRate) {
}
