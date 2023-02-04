package entities;

public class Triangle {

    public double a;
    public double b;
    public double c;

    // criar um método
    public double area(){
        double perimeter = (a + b + c) / 2;
        double result = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));

        return result;
    }
}
