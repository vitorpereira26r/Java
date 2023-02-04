import java.util.Scanner;
import java.util.Locale;
import util.Calculator;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circus: ");
        double radius = sc.nextDouble();

        double circunference = Calculator.circunference(radius);
        double volume = Calculator.volume(radius);

        System.out.printf("Circunference: %.2f%n", circunference);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("PI: %.2f%n", Calculator.PI);

        sc.close();
    }
}