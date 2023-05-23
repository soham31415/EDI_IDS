import java.util.*;

class NameException extends Exception{
    public NameException(String exp){
        System.out.println(exp);
    }
}

class AgeException extends Exception{
    public AgeException(String exp){
        System.out.println(exp);
    }
}


public class StudentException {

    String name, course;
    int rn, age;

    public StudentException(String name, int age, int rn, String course) throws NameException, AgeException{

        if (age <15 || age > 21){
            throw new AgeException("Invalid age");
        }

        if (name.matches(".*[0-9\\p{Punct}].*")){
            throw new NameException("Invalid name");
        }

        this.age = age;
        this.course = course;
        this.name = name;
        this.rn = rn;
    }

    public static void main(String[] args) throws AgeException, NameException{
        StudentException obj = new StudentException("Soham", 19, 38, "CS");
    }

}
