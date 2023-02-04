import entities.Comments;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comments c1 = new Comments("Have a nice trip");
        Comments c2 = new Comments("That's awesome!");
        Post p1 = new Post(sdf.parse("21/06/2018 14:16:09"),
                "Travelling to New Zealand",
                "Going to visit this wonderfull country",
                123);
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

        sc.close();
    }
}