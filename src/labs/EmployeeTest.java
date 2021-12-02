package labs;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1= new Employee(111,"bonie","accounts",500,"senior");
        Employee e2= new Employee(112,"bonie","accounts",700,"junior");

        String e=e1.printEmployeeDetails();
        System.out.println(e);
    }
}
