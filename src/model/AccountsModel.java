
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lenovo
 */
public class AccountsModel {
    String Account_ID,Account_Username,Account_Password,Role_ID;

    public AccountsModel(String Account_ID, String Account_Username, String Account_Password, String Role_ID) {
        this.Account_ID = Account_ID;
        this.Account_Username = Account_Username;
        this.Account_Password = Account_Password;
        this.Role_ID = Role_ID;
    }

    public String getAccount_ID() {
        return Account_ID;
    }

    public void setAccount_ID(String Account_ID) {
        this.Account_ID = Account_ID;
    }

    public String getAccount_Username() {
        return Account_Username;
    }

    public void setAccount_Username(String Account_Username) {
        this.Account_Username = Account_Username;
    }

    public String getAccount_Password() {
        return Account_Password;
    }

    public void setAccount_Password(String Account_Password) {
        this.Account_Password = Account_Password;
    }

    public String getRole_ID() {
        return Role_ID;
    }

    public void setRole_ID(String Role_ID) {
        this.Role_ID = Role_ID;
    }
    
    
}
