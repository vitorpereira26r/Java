/*
fazer um programa que le um numero inteiro N e depois le outros numeros inteiros N vezes, e depois mostrar a soma desses numeros
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int in;

        int soma = 0;
        for (int i = 0; i < n; i++){
            in = sc.nextInt();
            soma += in;
        }

        System.out.println(soma);

        sc.close();
    }
}