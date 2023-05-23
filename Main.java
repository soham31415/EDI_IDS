import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = scan.nextInt();
        }

//        for (int i=0; i<arr.length; i++)
//        {
//            for (int j=i+1; j< arr.length-i)
//            {
//                if (arr[i] == arr[j]){
//
//                }
//            }
//        }

        for (int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }
}