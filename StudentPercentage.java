import java.util.*;

abstract class StudentPercentage {
    abstract public double getPercentage();
}

class A extends StudentPercentage{

    private int m1, m2, m3;
    A(int marks1, int marks2, int marks3){
        this.m1 = marks1;
        this.m2 = marks2;
        this.m3 = marks3;
    }

    public double getPercentage() {
        return ( (double)((m1+m2+m3))/300)*100;
    }
}

class B extends StudentPercentage{

    private int m1, m2, m3, m4;
    B(int marks1, int marks2, int marks3, int marks4){
        this.m1 = marks1;
        this.m2 = marks2;
        this.m3 = marks3;
        this.m4 = marks4;
    }

    public double getPercentage() {
        return (((double) (m1+m2+m3+m4))/400)*100;
    }
}

class Marks{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        A objA = new A(90, 90, 90);
        B objB = new B(80, 80, 80, 80);

        System.out.println("Percentage of student A: " + objA.getPercentage());
        System.out.println("Percentage of student B: " + objB.getPercentage());
    }
}
