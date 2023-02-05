public class OnetoN {
    // Q: https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1
    public static void main(String[] args) {
        int N = 10;
        num(N, 1);
    }

    static void num(int N, int i){
        if(i > N){
            return;
        }

        System.out.print(i + " ");
        num(N, i+1);
    }
}
