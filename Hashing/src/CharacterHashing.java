import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        String s;
        Scanner in = new Scanner(System.in);
        s = in.next();

        // Assuming only lowercase characters
        // precompute
        /*int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }


        int q = in.nextInt();
        for (int i = q; i >0 ; i--) {
            char c= in.next().charAt(0);
            // fetch
            System.out.println(hash[c-'a']);
        }*/

        // Assuming all characters
        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }


        int q = in.nextInt();
        for (int i = q; i >0 ; i--) {
            char c = in.next().charAt(0);
            // fetch
            System.out.println(hash[c]);
        }
    }
}
