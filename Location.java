package edu.ucalgary.oop;

import java.util.ArrayList;
import edu.ucalgary.oop.DisasterVictim;
import edu.ucalgary.oop.Supply;

public class Location {
    private String name;
    private String address;
    private ArrayList<DisasterVictim> occupants = new ArrayList<>();
    private ArrayList<Supply> supplies = new ArrayList<>();
    
    // Constructor
    public Location(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for address
    public String getAddress() {
        return address;
    }

    // Setter method for address
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter method for occupants list
    public ArrayList<DisasterVictim> getOccupants() {
        return occupants;
    }

    // Setter method for occupants list
    public void setOccupants(ArrayList<DisasterVictim> occupants) {
        this.occupants = occupants;
    }

    // Add Method (occupant)
    public void addOccupant(DisasterVictim occupant) {
        occupants.add(occupant);
    }

    // Method to remove an occupant
    public void removeOccupant(DisasterVictim occupant) {
        occupants.remove(occupant);
    }

    // Getter method for supplies list
    public ArrayList<Supply> getSupplies() {
        return supplies;
    }

    // Setter method for supplies list
    public void setSupplies(ArrayList<Supply> supplies) {
        this.supplies = supplies;
    }

    // Add Method (supply)
    public void addSupply(Supply supply) {
        supplies.add(supply);
    }

    // Method to remove a supply
    public void removeSupply(Supply supply) {
        supplies.remove(supply);
    }
}