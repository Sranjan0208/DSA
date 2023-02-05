public class Reverse {
    // Q: https://leetcode.com/problems/reverse-string/
    public static void main(String[] args) {
        String s = "hello";
        reverse(s);
    }

    static void reverse(String str){

        if ((str==null)||(str.length() <= 1))
            System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }
}
