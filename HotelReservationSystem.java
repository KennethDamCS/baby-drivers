import java.util.*;
import java.sql.*;

class HotelReservationSystem{
    private Connection connection;

    public void ConnectDB(){
        try{
            String jdbcURL = "jdbc:postgresql://34.28.31.108:5432/postgres";
            String username = "postgres";
            String password = "COMP-380-Hotel-App";
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            if(connection != null){
                System.out.println("Connection OK");       
            }
            else{
                System.out.println("Connection failed");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void closeConnectDB(){
        try{
            if(connection != null){
                connection.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) throws SQLException{
        HotelReservationSystem hotel = new HotelReservationSystem();
        hotel.ConnectDB();
        hotel.closeConnectDB();
    }
}