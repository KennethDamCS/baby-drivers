public class Guest{

private String firstName;
private String lastName;


public Guest(fName, lName){
    this.firstName = fName;
    this.lastName = lName;
}


public String getFirstName(){
    return firstName;
}

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

public void sendEmail(String email){
// to be added
}


}