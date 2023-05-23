import java.util.*;
public class ArrayElementsDuplicate {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1=0, n2=0;

        System.out.println("Enter the number of elements in the array: ");
        n1 = scan.nextInt();
        System.out.println("Enter the number of elements in the 2nd array");
        n2 = scan.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int[] common = new int[20];
        int ind = 0;

        System.out.println("Enter elements for the first array:- ");
        for (int i=0; i<n1; i++)
        {
            arr1[i] = scan.nextInt();
        }

        System.out.println("Enter elements for the second array:- ");
        for (int i=0; i<n2; i++)
        {
            arr2[i] = scan.nextInt();
        }

        for (int i = 0; i < n1; i++) {
            for (int j=0; j<n2; j++)
            {
                if (arr1[i] == arr2[j]){
                    common[ind] = arr1[i];
                    ind++;
                }
            }
        }

        for (int i = 0; i < ind; i++) {
            System.out.println(common[i]);
        }

    }
}
