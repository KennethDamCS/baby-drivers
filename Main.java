import java.sql.*;

public class Main {
     public static void main(String[] args) throws SQLException{
        HotelReservationSystem hotel = new HotelReservationSystem();
        hotel.ConnectDB();
        hotel.closeConnectDB();
    }
}
 