public class Manager{
    //
    private String employeeId;
    private String FirstName;
    private String LastName;

    public Manager(String employeeId, String FirstName, String LastName ) {
        this.employeeId = employeeId;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName(String FirstName, String LastName) {
        String Name = LastName + FirstName;
        return Name;
    }
}