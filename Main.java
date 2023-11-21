import java.math.BigDecimal;
import java.sql.*;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) throws SQLException{
        Scanner scan = new Scanner(System.in);
        HotelReservationSystem hotel = new HotelReservationSystem();
        //System.out.println("Hello enter a new room: ");
        // int roomId = scan.nextInt(); String roomType = scan.next(); double price = scan.nextDouble(); String status = scan.next();
        // Room room = new Room(roomId, roomType, price, status);

        //Room room = new Room("203", "Single", new BigDecimal(200), "Available");
        
        // Room room = new Room();

        // room.printRooms();

        // hotel.closeConnectDB();
        Guest guest = new Guest("Daniel" , "Bautista" , "818 747 3255", "db@gmail.com", 4);
            System.out.println("Guest FirstName: " + guest.getFirstName());
            System.out.println("Guest LastName: " + guest.getLastName());
            System.out.println("Guest PhoneNumber: " + guest.getphoneNumber());
            System.out.println("Guest Email: " + guest.getemail());
            System.out.println("Guest Party Size: " + guest.getpartySize());
        guest.toDB();
    }
}
 