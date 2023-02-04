/*
fazer um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma
pessoa em reais. irformar quantos reais a pessoa vai pagar pelos dolares, considerando ainda que a
pessoa vai pagar 6% de IOF sobre o valor em dolar.
 */
import java.util.Scanner;
import java.util.Locale;
import util.CurrencyConverter;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What's the dolar price? ");
        CurrencyConverter.dolar = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollarsToBuy = sc.nextDouble();

        System.out.printf("Amount to be paid in reais: %.2f%n", CurrencyConverter.amountInReais(dollarsToBuy));

        sc.close();
    }
}