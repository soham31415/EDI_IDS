import java.util.*;

interface Man{
    public void store(String name);
    public void disp();
}

interface Account{
    public void set(int accNo, int balance);
    public void display();
}

class Inher implements Man, Account{
    String name;
    int accNo, balance;
    double interest;

    public void store(String name) {
        this.name = name;
    }

    public void set(int accNo, int balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    @Override
    public void disp() {
        System.out.println("The name of the person is: " + name);
    }

    @Override
    public void display() {
        System.out.println("The account no is: " + accNo);
        System.out.println("The balance is: " + balance);
        System.out.println("The interest is: " + balance*0.05);
    }
}

public class InterfaceMult {
    public static void main(String[] args) {
        Inher obj = new Inher();

        obj.set(1234567890, 10000);
        obj.store("Soham");
        obj.disp();
        obj.display();
    }
}
