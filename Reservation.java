import java.sql.Timestamp;

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


    
}