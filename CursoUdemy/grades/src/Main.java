import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Name: ");
        student.name = sc.nextLine();
        System.out.print("First Period Grade: ");
        student.firstPeriod = sc.nextDouble();
        System.out.print("Second Period Grade: ");
        student.secondPeriod = sc.nextDouble();
        System.out.print("Third Period Grade: ");
        student.thirdPeriod = sc.nextDouble();

        System.out.println();
        System.out.println("FINAL GRADE = " + student.finalGrade());
        System.out.println(student.approvation());




        sc.close();
    }
}