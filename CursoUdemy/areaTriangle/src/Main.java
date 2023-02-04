import entities.Triangle;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangle x, y; // isso aqui é o ponteiro(endereço da memória)
        x = new Triangle(); // alocou dinamicamente
        y = new Triangle(); // ''

        System.out.println("Enter the measures of the Triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of the Triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area of triangle X: %.4f%n", areaX);
        System.out.printf("Area of triangle Y: %.4f%n", areaY);

        sc.close();
    }
}