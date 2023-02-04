import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tamanho = sc.nextInt();
        double[] vect = new double[tamanho];
        double soma = 0.0;

        for (int i = 0; i < tamanho; i++){
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }

        System.out.println(soma/tamanho);


        sc.close();
    }
}