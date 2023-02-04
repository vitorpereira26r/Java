/*
ler numeros até ler um 0, e imprimir a soma dos numeros
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int numero = sc.nextInt();

        while (numero != 0){
            soma += numero;
            numero = sc.nextInt();
        }

        System.out.println(soma);

        sc.close();
    }
}