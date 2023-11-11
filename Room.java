import java.sql.*;

public class Room{
    private int roomId;
    private String roomType;
    private double price;

    public Room(int roomId, String roomType, double price) throws SQLException{
        this.roomId = roomId;
        this.roomType = roomType;
        this.price = price;
        toDB();
    }

    //Setters and Getters
    public void setRoomId(int roomId){
        this.roomId = roomId;
    }
    public int getRoomId(){
        return roomId;
    }

    public void setRoomType(String roomType){
        this.roomType = roomType;
    }
    public String getRoomType(){
        return roomType;
    }

    public void setPrice(double price){
        this.price = price;
        
    }
    public double getPrice(){
        return price;
    }

    public void toDB() throws SQLException{
        PreparedStatement ps = HotelReservationSystem.getConnection().prepareStatement("INSERT INTO rooms (room_id, room_type, price) VALUES (?, ?, ?)");
        ps.setInt(1, this.roomId);
        ps.setString(2, this.roomType);
        ps.setDouble(3, this.price);
        ps.executeUpdate();
    }
}

// private int roomNumber;
// private boolean isBooked;

// //get guest name from Guest class?
// private String Guest;
// private String roomType;
// private String roomInfo;
// private boolean isCleaned;

// public HotelRoom(int roomNumber, String roomType, String Guest, boolean isCleaned, String roomInfo){
//     this.roomNumber = roomNumber;
//     this.roomType = roomType;
//     this.Guest = Guest;
//     this.isBooked = true;
//     this.isCleaned = true;
//     this.roomInfo = roomInfo;
// }

// private void toggleCleaned(){
//     if(isCleaned = false){
//         isCleaned = true;
//     }else{
//         isCleaned = false;
//     }
// }

// public int getRoomNumber(){
//     return roomNumber;
// }

// public String getGuest(){
//     return Guest;
// }

// public String getRoomType(){
//     return roomType;
// }

// public void toggleBooked(){
//     if(isBooked = false){
//         isBooked = true;
//     }else{
//         isBooked = false;
//     }
// }

// public void changeRoominfo(String newInfo){
//     roomInfo = newInfo;
// }