import java.util.Scanner;

class CustomException extends Exception{

    public CustomException(String str){
        System.out.println(str);
    }

}
public class Power{

    public long power(int n, int p) throws CustomException {
            if (n <= 0 || p <= 0) {
                throw new CustomException("n or p should not be negative");
            }
            else {
                long ans=n;
                for (int i=1; i<p; i++){
                    ans *= n;
                }
                return ans;
            }
    }

    public static void main(String[] args) throws CustomException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int n = scan.nextInt();
        System.out.println("Enter the power: ");
        int p = scan.nextInt();
        Power obj = new Power();

        System.out.println(obj.power(n, p));

    }
}
