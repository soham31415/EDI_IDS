import java.util.*;
public class DuplicateWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        String[] arr = s.split(" ", 0);
        int count=0;
        boolean[] counted = new boolean[arr.length];

        for (int i = 0; i < arr.length-1; i++) {

            if (counted[i]){
                continue;
            }

            boolean isUnique = false;
            for (int j=i+1; j<arr.length; j++){
                if (arr[i].equalsIgnoreCase(arr[j])){
                    counted[j] = true;
                    isUnique = true;
                }
            }
            if (isUnique){
                count++;
            }
        }
        System.out.println("the count is: " + count);

    }
}
