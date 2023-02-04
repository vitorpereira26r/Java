import entities.Employe;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employe> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = sc.nextInt();

        for(int i = 1; i <= numberOfEmployees; i++){
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char answerOutsourced = sc.next().charAt(0);
            if (answerOutsourced == 'y'){
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                Double valuePerHour = sc.nextDouble();
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                Employe emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(emp);
            } else {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                Double valuePerHour = sc.nextDouble();
                Employe emp = new Employe(name, hours, valuePerHour);
                list.add(emp);
            }
        }
        System.out.println();
        System.out.println("Payments:");

        for(Employe emp : list){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();

    }
}