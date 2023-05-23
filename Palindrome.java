import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        String[] arr = s.split("", 0);
        int n = arr.length;
        String rev = "";

        for (int i=n-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }

        if (s.equalsIgnoreCase(rev)){
            System.out.println("The string is a palindrome");
        }

        else
            System.out.println("The string is not a palindrome");
    }

}
