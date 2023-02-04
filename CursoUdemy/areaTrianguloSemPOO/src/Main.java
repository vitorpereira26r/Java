/*
descobrir a area de dois triangulos X e Y, perguntando os tres lados de ambos, e falar qual o maior
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the measures of triangle X: ");
        double squareX1 = sc.nextDouble();
        double squareX2 = sc.nextDouble();
        double squareX3 = sc.nextDouble();
        double perimeterX = (squareX1 + squareX2 + squareX3)/2;
        double areaX = Math.sqrt(perimeterX*(perimeterX-squareX1)*(perimeterX-squareX2)*(perimeterX-squareX3));
        System.out.println("Enter the measures of triangle Y: ");
        double squareY1 = sc.nextDouble();
        double squareY2 = sc.nextDouble();
        double squareY3 = sc.nextDouble();
        double perimeterY = (squareY1 + squareY2 + squareY3)/2;
        double areaY = Math.sqrt(perimeterY*(perimeterY-squareY1)*(perimeterY-squareY2)*(perimeterY-squareY3));
        System.out.printf("Triangle X area = %.2f%n", areaX);
        System.out.printf("Triangle Y area = %.2f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }

    }
}