public class Umbrella {
    public static void main(String[] args) {
        String u = "Umbrella";
        int flag=0;
        String[] arr = u.split("", 0);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase("e")){
                System.out.println("e found");
                flag = 1;
                break;
            }

        }
        if (flag == 0)
        {
            System.out.println("e not found");
        }
    }
}
