import java.util.*;
public class StringHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        String[] arr = s.split(" ", 0);

        for(String e : arr){
            map.put(e, (map.getOrDefault(e, 0))+1);
        }

        System.out.println(map);
    }
}
