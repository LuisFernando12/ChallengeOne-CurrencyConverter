package br.com.luis.fernando.enums;

public enum CurrencyEnum {
    Dollar("$", "USD", "Dolar"),
    Euro("€", "EUR", "Euro"),
    LibraSterling("£", "GBP", "Libra Esterlina"),
    YenJapanese("¥", "JPY", "Iene Japonês"),
    Real("R$", "BRL", "Real"),
    DollarCanadian("CA$", "CAD", "Dólar canadense");

    private final String symbol;
    private final String isoCode;
    private final String name;

    CurrencyEnum(String symbol, String isoCode, String name) {
        this.symbol = symbol;
        this.isoCode = isoCode;
        this.name = name;
    }
    public String getIsoCode() {
        return isoCode;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  symbol+ " " + isoCode + " " + name ;
    }
}
