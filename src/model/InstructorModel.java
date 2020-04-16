package model;

public class InstructorModel {

    String instructorID, LastName, FirstName, Address, Shift;

    
    public InstructorModel(String instructorID, String LastName, String FirstName, String Address, String Shift) {
        this.instructorID = instructorID;
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.Address = Address;
        this.Shift = Shift;
    }

    public String getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(String instructorID) {
        this.instructorID = instructorID;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getShift() {
        return Shift;
    }

    public void setShift(String Shift) {
        this.Shift = Shift;
    }

    
}