import java.util.Scanner;
import java.util.Locale;
import entities.Product;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in the stock: ");
        int productsAdded = sc.nextInt();
        product.addProducts(productsAdded);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed in the stock: ");
        int sales = sc.nextInt();
        product.removeProducts(sales);

        System.out.println();
        System.out.println("Updated data: " + product);


        sc.close();
    }
}