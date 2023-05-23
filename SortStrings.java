import java.util.*;
public class SortStrings {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        String[] s = new String[10];

        for (int i = 0; i < 10; i++) {
            s[i] = scan.nextLine();
        }

        Arrays.sort(s);

        String combined = s[0] + s[1];

        System.out.println(combined);

        String [] arr = s[0].split("", 0);
        String[] rev = new String[arr.length];
        int j=0;
        for(int i= arr.length-1; i>=0; i--){
            rev[j++] = arr[i];
        }

        for (String e:rev){
            System.out.print(e);
        }

    }

}
