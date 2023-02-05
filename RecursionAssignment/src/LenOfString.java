public class LenOfString {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(length(s));
    }

    static int length(String s){
        if(s.equals("")){
            return 0;
        }

        return length(s.substring(1)) + 1;
    }
}
