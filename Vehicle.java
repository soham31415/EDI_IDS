import java.util.*;
class Vehicle {
    public void move(){
        System.out.println("Vehicle moves");
    }
}

class Car extends Vehicle{
    public void move() {
        System.out.println("Car drives on the road");
    }
}

class Helicopter extends Vehicle{
    public void move() {
        System.out.println("Helicopter flies in the air");
    }
}

class Train extends Vehicle{
    public void move() {
        System.out.println("The train runs on the track");
    }
}

class Tester{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the type of vehicle (Car/Helicopter/Train)");
        String s = scan.nextLine();

        Vehicle vehicle;
        switch (s){
            case "Car":
                vehicle = new Car();
                break;
            case "Helicopter":
                vehicle = new Helicopter();
                break;
            case "Train":
                vehicle = new Train();
                break;
            default:
                System.out.println("Invalid input");
                return;
        }
        vehicle.move();
    }
}
