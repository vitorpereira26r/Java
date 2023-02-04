import java.util.Scanner;
import java.util.Locale;
import entities.Employer;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employer emploee = new Employer();

        System.out.print("Name: ");
        emploee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        emploee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emploee.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emploee);

        System.out.println();
        System.out.print("Which percentagem to increse salary? ");
        double percentage = sc.nextDouble();
        emploee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated Data: " + emploee);



        sc.close();
    }
}