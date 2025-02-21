package edu.ucalgary.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import edu.ucalgary.oop.Location;

public class MedicalRecord {
	private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;

    // Constructor
    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) {
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        this.setDateOfTreatment(dateOfTreatment);
    }

    // Getters
    public Location getLocation() {
        return location;
    }

    public String getTreatmentDetails() {
        return treatmentDetails;
    }

    public String getDateOfTreatment() {
        return dateOfTreatment;
    }

    // Setters
    public void setLocation(Location location) {
        this.location = location;
    }

    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    public void setDateOfTreatment(String dateOfTreatment) {
        if (!isValidDate(dateOfTreatment)) {
            throw new IllegalArgumentException("Invalid date format. Expected format: yyyy-MM-dd");
        }
        this.dateOfTreatment = dateOfTreatment;
    }

    // Validate date format
    private boolean isValidDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false); // Disallow lenient parsing
        try {
            dateFormat.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

}
