import java.sql.*;

class HotelReservationSystem{
    private static final String jdbcURL = "jdbc:postgresql://34.28.31.108:5432/babydrivers";
    private static final String username = "postgres";
    private static final String password = "COMP-380-Hotel-App";
    private static Connection connection;
    
    //Getter for connection
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(jdbcURL, username, password);
    }

    //Closes connection to the database to free up resources
    public void closeConnectDB(){
        try{
            if(connection != null){
                connection.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    // //Establishes connectiong from app to the database
    // public void ConnectDB(){
    //     try{
    //         String jdbcURL = "jdbc:postgresql://34.28.31.108:5432/babydrivers";
    //         String username = "postgres";
    //         String password = "COMP-380-Hotel-App";
    //         Connection connection = DriverManager.getConnection(jdbcURL, username, password);

    //         if(connection != null){
    //             System.out.println("Connection OK");       
    //         }
    //         else{
    //             System.out.println("Connection failed");
    //         }
    //     }catch (Exception e){
    //         e.printStackTrace();
    //     }
    // }
    
}