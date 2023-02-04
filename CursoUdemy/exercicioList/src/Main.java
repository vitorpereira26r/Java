import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;
import entities.Employe;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Employe employe = new Employe();
        List<Employe> list = new ArrayList<>();

        System.out.print("How many employes will be registered? ");
        int numberEmployes = sc.nextInt();
        System.out.println();

        for (int i = 0; i < numberEmployes; i++){
            System.out.println("Employe #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employe emp = new Employe(id, name, salary);

            list.add(emp);
            System.out.println();
        }

        System.out.print("Enter the employe id that will have salary increse: ");
        int id = sc.nextInt();
        int position = positionId(list, id);
        if (position < 0){
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage increase: ");
            Double percentage = sc.nextDouble();
            list.get(position).increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employes:");
        for (int i = 0; i < numberEmployes; i++){
            System.out.println(list.get(i).toString());
        }






        sc.close();
    }

    public static int positionId (List<Employe> list, int id){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}