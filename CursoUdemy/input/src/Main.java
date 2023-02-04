import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double altura;
        char genero;

        nome = sc.next();
        idade = sc.nextInt();
        altura = sc.nextDouble();
        genero = sc.next().charAt(0);
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(genero);


        sc.close();
    }
}