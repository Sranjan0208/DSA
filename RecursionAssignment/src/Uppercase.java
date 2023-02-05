public class Uppercase {
    // Q: https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
    public static void main(String[] args) {
        String s = "sujalRanjan";
        char res = uppercase(s, 0);
        if(res == 0){
            System.out.println("No uppercase letter");
        } else {
            System.out.println(res);
        }
    }

    static char uppercase(String s, int i){
        if(s.charAt(i) == '\0'){
            return 0;
        }
        if(Character.isUpperCase(s.charAt(i))){
            return s.charAt(i);
        }
        try {
            return uppercase(s, i+1);
        }
        catch(Exception e) {
            System.out.println("Exception occurs");
        }
        return 0;
    }
}
