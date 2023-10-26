public class Manager extends Employee{
    private String firstName;
    private String lastName;

    public Manager(firstName, lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }





    public void changeRoomInfo(HotelRoom room, String newInfo){
        room.changeRoomInfo(newInfo);
    }
}