import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++){
            list.add(i);
        }

        list.add(3, 90);
        list.remove(4);
        System.out.println(list.size());
        for (int number : list){
            System.out.println(number);
        }

        System.out.println("Posição do 6: " + list.indexOf(6));
    }
}