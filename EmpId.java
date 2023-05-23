import java.util.*;

class Guy{
    String fName, lName;

    public String getFName(String fName){
        this.fName = fName;
        return this.fName;
    }

    public String getLName(String lName){
        this.lName = lName;
        return this.lName;
    }
}

class Emp extends Guy{
    int empId;
    String jobTitle;

    public int getEmpId(int empId){
        this.empId = empId;
        return this.empId;
    }

    public String getLName(String jobTitle){
        this.jobTitle = jobTitle;
        System.out.println("This is a job title");
        return this.jobTitle;
    }
}

public class EmpId {

    public static void main(String[] args) {
        Emp obj = new Emp();
        System.out.println(obj.getFName("Soham") + "  " + obj.getLName("sde") + " " + obj.getEmpId(123));
    }

}
