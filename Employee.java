public class Employee{

    private String employeeId;
    private String FirstName;
    private String LastName;

    public Employee(String employeeId, String FirstName, String LastName ) {
        this.employeeId = employeeId;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName(String FirstName, String LastName) {
        String Name = FirstName + LastName;
        return Name;
    }

    public void checkin() {
        //method is dependent on how the Reservation class is made

    }
    
   
    public Reservation createReservation(int startDate, int endDate, String guest, int roomNumber) {
        Reservation newReservation = new Reservation(startDate, endDate, guest,roomNumber); //Employee will be able to create Reservation using dates, guest name, and room number
            Reservation.reserve(newReservation); //Reservation will be created in HotelRoom Class
            return newReservation;
    }

    public Reservation viewReservation(Reservation newReservation) {
        return newReservation; 
        
    }

    public Reservation editReservation(int newstartDate, int newendDate, String guest, int newroomNumber) {
        Reservation newReservation = new Reservation(newstartDate, newendDate, guest, newroomNumber); //Employee will be able to edit Reservation which will create a new Reservation using new dates and room number but same guest name
            HotelRoom.reserve(newReservation); //Reservation will be created in HotelRoom Class
            return newReservation;
        //method is depedent on how the Reservation class is made
    }

    

    
}