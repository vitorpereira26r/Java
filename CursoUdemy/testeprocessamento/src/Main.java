public class Main {
    public static void main(String[] args) {

        int x = 5;
        int y = x * 2;

        System.out.println(x);
        System.out.println(y);

        // area do trapesio
        double baseMaior, baseMenor, altura, area;
        baseMaior = 8.0;
        baseMenor = 6.0;
        altura = 5.0;

        area = (baseMaior+baseMenor)/2.0*altura;
        System.out.println(area);

        // dividir inteiros
        int a, b;
        double resultado;

        a = 5;
        b = 2;

        resultado = (double) 5/2;
        System.out.println(resultado);
    }
}