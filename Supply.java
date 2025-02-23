package edu.ucalgary.oop;

public class Supply {
    private String type;
    private int quantity;

    // Constructor
    public Supply(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }
    // Getter
    public String getType() {
        return type;
    }
    // Setter
    public void setType(String type) {
        this.type = type;
    }
    // // Getter method for quantity
    public int getQuantity() {
        return quantity;
    }
    // Setter method for quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
