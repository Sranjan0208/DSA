import java.util.Scanner;

public class HelloGoodbye {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name1 = in.next();
        String name2 = in.next();
        System.out.println("Hello " + name1 + " and " + name2);
        System.out.println("GoodBye " + name2 + " and " + name1);

    }
}
