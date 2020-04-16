/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jomar
 */
public class EquipmentModel {

    String equipmentID;
    String equipmentName;
    String equipmentType;
    String dateReceived;
    String price;
    String quantity;
    String totalPrice;

    public String getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(String equipmentID) {
        this.equipmentID = equipmentID;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(String dateReceived) {
        this.dateReceived = dateReceived;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public EquipmentModel(String equipmentID, String equipmentName, String equipmentType, String dateReceived, String price, String quantity, String totalPrice) {
        this.equipmentID = equipmentID;
        this.equipmentName = equipmentName;
        this.equipmentType = equipmentType;
        this.dateReceived = dateReceived;
        this.price = price;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

}
