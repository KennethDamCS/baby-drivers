import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Guest{

private String firstName;
private String lastName;
private String phoneNumber;
private String email;
private int partySize;
private int guestId;



public Guest(String firstName, String lastName, String phoneNumber, String email, int partySize){
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.partySize = partySize;
}

public void setfirstName(String firstName){
    this.firstName = firstName;
}

public void setlastName(String lastName){
    this.lastName = lastName;
}

public void setphoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber;
}

public void setemail (String email) {
    this.email = email;
}

public void setpartySize (int partySize) {
    this.partySize = partySize;
}

public void setguestId (int guestId) {
    this.guestId = guestId;
}

public int getguestId () {
    return guestId;
}

public int getpartySize () {
    return partySize;
}

public String getFirstName(){
    return firstName;
}

public String getLastName(){
    return lastName;
}

public String getphoneNumber() {
    return phoneNumber;
}

public String getemail() {
    return email;
}

public static List<Guest> getAllguests() throws SQLException{
        List<Guest> guests = new ArrayList<>();
        PreparedStatement ps = HotelReservationSystem.getConnection().prepareStatement("SELECT * FROM guests");
        ResultSet  rs =  ps.executeQuery();

        while(rs.next()){
            Guest guest = new Guest(
                rs.getString("guest_firstname"), 
                rs.getString("guest_lastname"),
                rs.getString("guest_phonenumber"),
                rs.getString("guest_email"),
                rs.getInt("guest_partysize")
                );
                guest.setguestId(rs.getInt("guest_id"));
                guests.add(guest);
        }
        return guests;
    }

    public static void  printGuests() throws SQLException{
        List<Guest> guests = Guest.getAllguests();
        for (Guest guest : guests){
            System.out.println("Guest FirstName: " + guest.getFirstName());
            System.out.println("Guest LastName: " + guest.getLastName());
            System.out.println("Guest PhoneNumber: " + guest.getphoneNumber());
            System.out.println("Guest Email: " + guest.getemail());
            System.out.println("Guest Party Size: " + guest.getpartySize());
            System.out.println("- - - - - - - - - - - - - - - - - ");
        }
    }

public void toDB() throws SQLException{
        PreparedStatement ps = HotelReservationSystem.getConnection().prepareStatement("INSERT INTO guests (guest_firstname, guest_lastname, guest_phonenumber, guest_email, guest_partysize) VALUES (?, ?, ?, ?, ?) RETURNING guest_id");
        ps.setString(1, this.firstName);
        ps.setString(2, this.lastName);
        ps.setString(3, this.phoneNumber);
        ps.setString(4, this.email);
        ps.setInt(5, this.partySize);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            this.setguestId(rs.getInt("guest_id"));
        }
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


}