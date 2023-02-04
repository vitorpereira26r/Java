/*
converter celcius para fahrenheit, perguntar o usuário se quer fazer outra conversão
 */
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char answer;

        do {
            System.out.print("Digite a temperatura em Graus Celcius: ");
            double temperatureCelcius = sc.nextDouble();
            double temperaturefahrenheit = ((9*temperatureCelcius)/5)+32;
            System.out.printf("A temperatura correspondente em fahrenheit é: %.2f%n", temperaturefahrenheit);
            System.out.print("Quer fazer mais uma conversão? s/n");
            answer = sc.next().charAt(0);

        } while (answer == 's');


        sc.close();

    }
}