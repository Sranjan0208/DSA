import java.util.Scanner;

public class SpecialFibonacci {
    // Q: https://www.codechef.com/problems/FIBXOR01/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        int a,b,n;
        for (int i = 0; i < t; i++) {
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            System.out.println(fibo(a,b,n));
        }
    }

    static int fibo(int a, int b, int n){
        if(n%3==1){
            return b;
        }

        if(n%3==0){
            return a;
        }

        return fibo(a,b,n-1) ^ fibo(a,b,n-2);
    }
}
