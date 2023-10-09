public class HotelRoom{
private int roomNumber;
private boolean isBooked;

//get guest name from Guest class?
private String Guest;
private String roomType;

public HotelRoom(roomNumber, String roomType, String Guest){
    this.roomNumber = roomNumber;
    this.roomType = roomType;
    this.Guest = Guest;
}

public int getRoomNumber{
    return roomNumber;
}

public int getGuest{
    return Guest;
}

public int getRoomType{
    return roomType;
}

public void setBooked(){
    isBooked = true;
}

public void setUnbooked(){
    isBooked = false;
}



}