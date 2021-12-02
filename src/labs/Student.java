package labs;

public class Student implements Stud {
    private String lastName;
    private int  idNumber;

    public Student(String lastName, int idNumber) {
        this.lastName = lastName;
        this.idNumber = idNumber;
    }
    public Student(){
        this("ronald",112);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public boolean compareTo(Student s) {
        if(this.idNumber==s.idNumber)
            return true;
        else
            return false;
    }
}
