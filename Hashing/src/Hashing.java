import java.util.Arrays;
import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int q = in.nextInt();

        for (int i = q; i > 0; i--) {
            int number = in.nextInt();
            // fetch
            System.out.println(hash[number]);
        }


    }
}
