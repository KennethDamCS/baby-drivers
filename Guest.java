public class Guest{

private String firstName;
private String lastName;
private String phoneNumber;
private String email;


<<<<<<< HEAD

public Guest(String firstName, String lastName, String phoneNumber, String email){
    this.firstName = fName;
    this.lastName = lName;
    this.phoneNumber = phoneNumber;
    this.email = email;
=======
public Guest(String fName, String lName){
    firstName = fName;
    lastName = lName;
>>>>>>> 8081ed5efac2b9bf7a3f6605d2771eeed0f41ed1
}


public String getFirstName(){
    return firstName;
}

<<<<<<< HEAD
public Reservation viewReservation(){

}

/* 
//makes a reservation
//for date it uses the Java.time package
// changes can be made depending on future code changes
public Reservation makeReservation(LocalDatetime startDate, LocalDatetime endDate, HotelRoom room,Guest guest){
    Reservation newReservation = new Resercation(startDate, endDate, room, guest);
    room.reserve();
    return newReservation;
}

//calles a method in HotelRoom to unreserve the room
public void cancelReservation(Reservation reservation){
    reservation.room.unreserve();
}
*/
public void sendEmail(String email){
// to be added
}
=======
>>>>>>> 8081ed5efac2b9bf7a3f6605d2771eeed0f41ed1


}