public class Manager extends Employee{
    String managerOverride = null;

    //Constructor w/ managerOverride
    public Manager(String employeeId, String FirstName, String LastName, String managerOverride){
        super(employeeId, FirstName, LastName);
        this.managerOverride = managerOverride;
    }
    
    private void setManagerOverride(String m){
        managerOverride = m;
    }

    private String getManagerOverride(){
        return managerOverride;
    }
}