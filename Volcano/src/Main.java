import java.util.*;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        Volcano a1 = new Volcano("a1", 10);

        for (int i = 0; i < 7; i++) {
            System.out.println(a1.add(random.nextInt(2001)));
        }
        System.out.println("---------");
        System.out.println(a1.toString());
        System.out.println("Average: " + a1.average());
        System.out.println("Max under 1000: " + a1.maxUnder(1000));
        System.out.println("");
        System.out.println("---------");
        a1.print();
        System.out.println("---------");

        a1.delete(2);
        a1.print();
        a1.fix(1, 500);
        System.out.println("---------");
        a1.deleteAll();
        a1.print();

        System.out.println("");


    }
}