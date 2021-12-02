package labs;

public class Employee {
     private int employeeId;
     private String name;
     private String department;
     private double salary;
     private String position;

    public Employee(int employeeId, String name, String department, double salary, String position) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.position = position;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public double addBonus(){
        return salary+200;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null ||!(obj instanceof Employee))
        return false;
        Employee e= (Employee) obj;
        return (e.position.equals(((Employee) obj).position));
    }

    public String printEmployeeDetails(){
        return "employees Id: "+employeeId+"\n name: "+name+"\n department: "+department+ "\n salary: " +salary+
                "\n position: "+position;
    }

}
