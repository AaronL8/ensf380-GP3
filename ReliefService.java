package edu.ucalgary.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import edu.ucalgary.oop.Location;
import edu.ucalgary.oop.Inquirer;
import edu.ucalgary.oop.DisasterVictim;


public class ReliefService {
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;

    // Constructor
    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, Location lastKnownLocation) {
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        this.setDateOfInquiry(dateOfInquiry);
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }

    // Getters
    public Inquirer getInquirer() {
        return inquirer;
    }

    public DisasterVictim getMissingPerson() {
        return missingPerson;
    }

    public String getDateOfInquiry() {
        return dateOfInquiry;
    }

    public String getInfoProvided() {
        return infoProvided;
    }

    public Location getLastKnownLocation() {
        return lastKnownLocation;
    }

    // Setters
    public void setInquirer(Inquirer inquirer) {
        this.inquirer = inquirer;
    }

    public void setMissingPerson(DisasterVictim missingPerson) {
        this.missingPerson = missingPerson;
    }

    public void setDateOfInquiry(String dateOfInquiry) {
        if (!isValidDate(dateOfInquiry)) {
            throw new IllegalArgumentException("Invalid date format. Expected format: yyyy-MM-dd");
        }
        this.dateOfInquiry = dateOfInquiry;
    }

    public void setInfoProvided(String infoProvided) {
        this.infoProvided = infoProvided;
    }

    public void setLastKnownLocation(Location lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }

    private boolean isValidDate(String date) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false);
            dateFormat.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public String getLogDetails() {
        return String.format(
            "Inquirer: %s, Missing Person: %s, Date of Inquiry: %s, Info Provided: %s, Last Known Location: %s",
            inquirer.getFirstName(),
            missingPerson.getFirstName(),
            dateOfInquiry,
            infoProvided,
            lastKnownLocation.getName()
        );
    }
}
