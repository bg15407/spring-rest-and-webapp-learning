package digital.gayan.roomwebproject.models;

public class Staff {
    private String employeeNo;
    private String firstName;
    private String lastName;
    private Positions position;

    public Staff(String employeeNo, String firstName, String lastName, Positions position) {
        this.employeeNo = employeeNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public Staff() {
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Positions getPosition() {
        return position;
    }

    public void setPosition(Positions position) {
        this.position = position;
    }
}
