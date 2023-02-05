public class Nto1 {
    public static void main(String[] args) {
        funRev(5);
    }

    // Q. Print 5, 4, 3, 2, 1  Given: n = 5
    static void fun(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        fun(n - 1);
    }

    // Q. Print 1, 2, 3, 4, 5 Given: n = 5
    static void funRev(int n){
        if(n == 0){
            return;
        }

        funRev(n - 1);
        System.out.println(n);
    }

}
