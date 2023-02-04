package util;

public class CurrencyConverter {

    public static double dolar;
    public static final double IOF_TAX = 1.06; // 6%

    public static double amountInReais (double dollarsToBuy){
        return dollarsToBuy * dolar * IOF_TAX;
    }


}
