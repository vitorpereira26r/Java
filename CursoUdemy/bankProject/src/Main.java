import java.util.Scanner;
import java.util.Locale;
import entities.ClientData;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double initialDeposit = 0.0;
        System.out.print("Enter the account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter the account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char answer = sc.next().charAt(0);
        if (answer == 'y') {
            System.out.print("Enter the initial deposit value: ");
            initialDeposit = sc.nextDouble();
        }

        ClientData client = new ClientData(accountNumber, name, initialDeposit);

        System.out.println("Account Data:");
        System.out.println(client);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        client.deposit(deposit);
        System.out.println("Updated Data: ");
        System.out.println(client);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        client.withdraw(withdraw);
        System.out.println("Updated data: ");
        System.out.println(client);










        sc.close();
    }
}