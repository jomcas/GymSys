package model;

public class ManagerModel {

    String managerID, accountID, LastName, FirstName, Address, Shift;

    public ManagerModel(String managerID, String accountID, String LastName, String FirstName, String Address, String Shift) {
        this.managerID = managerID;
        this.accountID = accountID;
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.Address = Address;
        this.Shift = Shift;
    }

    public String getManagerID() {
        return managerID;
    }

    public void setCustomerID(String customerID) {
        this.managerID = customerID;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
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
