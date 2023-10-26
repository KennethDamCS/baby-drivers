public class Reservation{

    private Timestamp startDate;
    private Timestamp endDate;
    private Guest guest;
    private int roomNumber;


    public Reservation(Timestamp startDate, Timestamp endDate, Guest guest, int roomNumber){
        this.startDate = startDate;
        this.endDate = endDate;
        this.guest = guest;
        this.roomNumber = roomNumber;
    }

    public String reserve_Room(Date start_Date, Date end_Date, int room_Number, Guest guest){
        if (HotelRoom.roomNumber == room_Number && !(HotelRoom.isBooked) && HotelRoom.isCleaned) {
            HotelRoom.isBooked = true;
            HotelRoom.Guest = guest;
        }
        else if (HotelRoom.isBooked) {
            return "Hotel room is already booked\nGuest info: " + HotelRoom.Guest;
        } else {
            return "Error during reservation creation"; 
        }
    }
    
}