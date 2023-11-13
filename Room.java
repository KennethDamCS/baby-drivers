import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Room{
    private int roomId;
    private String roomNumber;
    private String roomType;
    private BigDecimal roomPrice;
    private String roomStatus;

    //Constructors
    public Room(){}
    
    public Room(String roomNumber, String roomType, BigDecimal roomPrice, String roomStatus) throws SQLException{
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.roomStatus = roomStatus;
    }

    //Setters and Getters
    public void setRoomNumber(String roomNumber){
        this.roomNumber = roomNumber;
    }

    public void setRoomType(String roomType){
        this.roomType = roomType;
    }

    public void setRoomPrice(BigDecimal roomPrice){
        this.roomPrice = roomPrice;
    }

    public void setRoomStatus(String roomStatus){
        this.roomStatus = roomStatus;
    }

    public void setRoomId(int roomId){
        this.roomId = roomId;
    }

    public int getRoomId(){
        return  roomId;
    }

    public String getRoomNumber(){
        return  roomNumber;
    }

    public String getRoomType(){
        return  roomType;
    }

    public BigDecimal getRoomPrice(){
        return  roomPrice;
    }

    public String getRoomStatus(){
        return  roomStatus;
    }

    //Puts all the rooms into a List
    public static List<Room> getAllRooms() throws SQLException{
        List<Room> rooms = new ArrayList<>();
        PreparedStatement ps = HotelReservationSystem.getConnection().prepareStatement("SELECT * FROM rooms_test");
        ResultSet  rs =  ps.executeQuery();

        while(rs.next()){
            Room  room = new Room(
                rs.getString("room_number"), 
                rs.getString("room_type"),
                rs.getBigDecimal("room_price"),
                rs.getString("room_status")
                );
                room.setRoomId(rs.getInt("room_id"));
                rooms.add(room);
        }
        return rooms;
    }

    //Prints all rooms
    public static void  printRooms() throws SQLException{
        List<Room> rooms = Room.getAllRooms();
        for (Room room : rooms){
            System.out.println("Room ID: " + room.getRoomId());
            System.out.println("Room No: " + room.getRoomNumber());
            System.out.println("Room Type: " + room.getRoomType());
            System.out.println("Room Price: " + room.getRoomPrice());
            System.out.println("Room Status: " + room.getRoomStatus());
            System.out.println("- - - - - - - - - - - - - - - - - ");
        }
    }

    //Saves room data to database
    public void toDB() throws SQLException{
        PreparedStatement ps = HotelReservationSystem.getConnection().prepareStatement("INSERT INTO rooms_test (room_number, room_type, room_price, room_status) VALUES (?, ?, ?, ?) RETURNING room_id");
        ps.setString(1, this.roomNumber);
        ps.setString(2, this.roomType);
        ps.setBigDecimal(3, this.roomPrice);
        ps.setString(4, this.roomStatus);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            this.setRoomId(rs.getInt("room_id"));
        }
    }
    
}


// public class Room{
//     private int roomId;
//     private String roomType;
//     private double price;
//     private String status;

//     //Constructor that will save Room data to database
//     public Room(int roomId, String roomType, double price, String status) throws SQLException{
//         this.roomId = roomId;
//         this.roomType = roomType;
//         this.price = price;
//         this.status = status;
//         toDB();
//     }

//     //Setters and Getters
//     public void setRoomId(int roomId){
//         this.roomId = roomId;
//     }
//     public int getRoomId(){
//         return roomId;
//     }

//     public void setRoomType(String roomType){
//         this.roomType = roomType;
//     }
//     public String getRoomType(){
//         return roomType;
//     }

//     public void setPrice(double price){
//         this.price = price;
        
//     }
//     public double getPrice(){
//         return price;
//     }

//     //Method that will insert current attributes to database
//     public void toDB() throws SQLException{
//         PreparedStatement ps = HotelReservationSystem.getConnection().prepareStatement("INSERT INTO rooms (room_id, room_type, room_price, room_status) VALUES (?, ?, ?, ?)");
//         ps.setInt(1, this.roomId);
//         ps.setString(2, this.roomType);
//         ps.setDouble(3, this.price);
//         ps.setString(4, this.status);
//         ps.executeUpdate();
//     }
// }

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