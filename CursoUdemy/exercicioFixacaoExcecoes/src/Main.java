import model.entities.Account;
import model.excepiton.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int accountNumber = sc.nextInt();
            System.out.print("Holder: ");
            String holder = sc.next();
            System.out.print("Inicial balance: ");
            Double inicialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();

            Account acc = new Account(accountNumber, holder, inicialBalance, withdrawLimit);

            System.out.println();
            System.out.print("Enter the amount for withdraw: ");
            Double withdrawAmount = sc.nextDouble();

            acc.withdraw(withdrawAmount);

            System.out.printf("New balance: %.2f", acc.getBalance());
        } catch (DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }


        sc.close();
    }
}