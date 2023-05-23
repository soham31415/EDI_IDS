import java.util.*;
public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();


        String[] a = s.split("", 0);
        int n = a.length;
        String temp;

        for (int i = 0; i < n/2; i++) {
            temp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = temp;
        }

        s = String.join("", a);

        System.out.println(s);
    }
}
