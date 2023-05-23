import java.util.HashSet;

public class SortedNumbersArray {

    public static void main(String[] args) {
        int[] arr = {22, 3, 1, 2, 5, 4, 234, 432};
        int cnum=0;
        int c = 0;
        int max = 0;

        HashSet<Integer> nums = new HashSet<>();

        for (int num:arr){
            nums.add(num);
        }

        for (Integer num:nums){
            if (!nums.contains(num-1)) {
                cnum = num;
                c=1;

                while (nums.contains(cnum + 1)) {
                    cnum++;
                    c++;
                }
                if (max < c){
                    max = c;
                }
            }
        }
        System.out.println(max);
    }

}
