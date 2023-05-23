import java.util.*;
public class Prime {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int flag = 0;

        for (int i=2; i<=num/2; i++){
            if (num%i == 0){
                flag = 1;
                break;
            }
        }

        if (flag == 0){
            System.out.println("no is prime");
        }
        else {
            System.out.println("no is not prime");
        }
    }

}
