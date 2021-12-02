package labs;

public class Clerk extends Employee {


    public Clerk(int employeeId, String name, String department, double salary, String position) {
        super(employeeId, name, department, salary, position);

    }
    @Override
    public double addBonus() {
        return getSalary()+100;
    }
}
