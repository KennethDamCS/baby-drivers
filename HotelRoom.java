public class HotelRoom{
private int roomNumber;
private boolean isBooked;

//get guest name from Guest class?
private String Guest;
private String roomType;
private String roomInfo;
private boolean isCleaned;

public HotelRoom(int roomNumber, String roomType, String Guest, boolean isCleaned, String roomInfo){
    this.roomNumber = roomNumber;
    this.roomType = roomType;
    this.Guest = Guest;
    this.isBooked = true;
    this.isCleaned = true;
    this.roomInfo = roomInfo;
}

private void toggleCleaned(){
    if(isCleaned = false){
        isCleaned = true;
    }else{
        isCleaned = false;
    }
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


public void toggleBooked(){
    if(isBooked = false){
        isBooked = true;
    }else{
        isBooked = false;
    }
}

public void changeRoominfo(String newInfo){
    roomInfo = newInfo;
}



}