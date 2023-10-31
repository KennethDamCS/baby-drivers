import java.sql.*;


public class ConnectDB{
    public static void main(String[] args) throws SQLException{
        String jdbcURL = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "postgres";

        try{
            //Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            //CREATE DATA IN DB
            // String sql = "INSERT INTO rooms (room_id, room_name, room_type, vacancy)"
            //             +"VALUES ('1', '101', 'single_bed', 'false')";
            // Statement statement = connection.createStatement();
            // int rows = statement.executeUpdate(sql);
            // if(rows > 0){
            //     System.out.println("A new room has been added successfully");
            // }
            
            //READ DATA FROM DB
            // String sql = "SELECT * FROM rooms";
            // Statement statement = connection.createStatement();
            // ResultSet result = statement.executeQuery(sql);
            // while(result.next()){
            //     int room_id = result.getInt("room_id");
            //     String room_name = result.getString("room_name");
            //     String room_type = result.getString("room_type");
            //     boolean vacancy = result.getBoolean("vacancy");
            //     String isEmpty = null;
            //     if(vacancy == true){
            //         isEmpty = "empty";
            //     }
            //     else{
            //         isEmpty = "taken";
            //     }
            //     System.out.println("Room ID: " + room_id + ", "
            //                      + "Room Number: " + room_name + ", "
            //                      + "Room Type: " + room_type + ", "
            //                      + "Room Vacancy: " + isEmpty);
            // }

            //UPDATE DATA IN DB
            // String sql = "UPDATE rooms SET vacancy='true' WHERE room_name='101'";
            // Statement statement = connection.createStatement();
            // int rows = statement.executeUpdate(sql);
            // if(rows > 0){
            //     System.out.println("Room info has been updated");
            // }

            //DELETE DATA FROM DB
            // String sql = "DELETE FROM rooms WHERE room_name='101'";
            // Statement statement = connection.createStatement();
            // int rows = statement.executeUpdate(sql);
            // if(rows > 0){
            //     System.out.println("Room has been deleted");
            // }



            // if(connection != null){
            //     System.out.println("Connection OK");       
            // }
            // else{
            //     System.out.println("Connection failed");
            // }

            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}