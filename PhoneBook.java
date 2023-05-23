import java.util.*;
public class PhoneBook {
    public boolean validate(String n){
        if (n.length() == 8 && n.charAt(0) != 0){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean validateName(String name){
        String[] arr = name.split(" ", 0);
        if (arr.length <=2 && arr.length > 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name, num;
        PhoneBook obj = new PhoneBook();

        System.out.println("Enter the number of entries in the phonebook: ");
        int n = scan.nextInt();

        System.out.println("Enter first the name and then phone number: ");
        HashMap<String, String> phBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name:");
            name = scan.nextLine().toLowerCase();

            System.out.println("Enter phone number:");
            num = scan.nextLine();

            if (obj.validateName(name) && obj.validate(num)) {
                phBook.put(name, num);
            } else {
                System.out.println("Invalid input, either the number is not 8 digits or leading with a 0, or the name is more than 2 words");
                i--;
            }
        }

        int exit;
        String query = "";
        while(true) {
            System.out.println("Enter 0 to continue and 1 to exit");
            exit = scan.nextInt();
            if (exit == 0) {
                System.out.println("Enter the query: ");
                query = scan.nextLine().toLowerCase();
                if (phBook.containsKey(query)) {
                    System.out.println(query + ": " + phBook.get(query));
                }
            }
            else {
                break;
            }
        }



    }
}
