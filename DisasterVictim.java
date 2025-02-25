package edu.ucalgary.oop;

import java.util.regex.*;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private final int ASSIGNED_SOCIAL_ID;
    private FamilyRelation[] familyConnections;
    private MedicalRecord[] medicalRecords;
    private Supply[] personalBelongings;
    private final String ENTRY_DATE;
    private String gender;
    private String comments;
    private static int counter;

    // Constructors
    public DisasterVictim(String firstName, String ENTRY_DATE) throws IllegalArgumentException {
        if(!isValidDateFormat(ENTRY_DATE)) {
            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
        this.ASSIGNED_SOCIAL_ID = generateSocialID();
    }
    public DisasterVictim(String firstName, String ENTRY_DATE, String dateOfBirth) throws IllegalArgumentException {
        this.setDateOfBirth(dateOfBirth);
        if(!isValidDateFormat(ENTRY_DATE) || convertDateStringToInt(ENTRY_DATE) < convertDateStringToInt(dateOfBirth)) {
            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
        this.ASSIGNED_SOCIAL_ID = generateSocialID();
    }

    // Getters
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }
    public int getAssignedSocialID() {
        return this.ASSIGNED_SOCIAL_ID;
    }
    public FamilyRelation[] getFamilyConnections() {
        return this.familyConnections;
    }
    public MedicalRecord[] getMedicalRecords() {
        return this.medicalRecords;
    }
    public Supply[] getPersonalBelongings() {
        return this.personalBelongings;
    }
    public String getEntryDate() {
        return this.ENTRY_DATE;
    }
    public String getComments() {
        return this.comments;
    }
    public String getGender() {
        return this.gender;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDateOfBirth(String dateOfBirth) throws IllegalArgumentException {
        if (isValidDateFormat(dateOfBirth)) {
            this.dateOfBirth = dateOfBirth;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
    public void setFamilyConnections(FamilyRelation[] connections) {
        this.familyConnections = connections;
    }
    public void setMedicalRecords(MedicalRecord[] records) {
        this.medicalRecords = records;
    }
    public void setPersonalBelongings(Supply[] belongings) {
        this.personalBelongings = belongings;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    // Add Methods
    public void addPersonalBelonging(Supply supply) {
        if(personalBelongings == null) {
            Supply[] arr = new Supply[1];
            arr[0] = supply;
            this.personalBelongings = arr;
        }
        else {
            int arr_length = this.personalBelongings.length;
            Supply[] arr = new Supply[arr_length + 1];
            for(int i = 0; i < arr_length; i++) {
                arr[i] = this.personalBelongings[i];
            }
            arr[arr_length] = supply;
            this.personalBelongings = arr;
        }
    }
    public void addFamilyConnection(FamilyRelation record) {
        if(familyConnections == null) {
            FamilyRelation[] arr = new FamilyRelation[1];
            arr[0] = record;
            this.familyConnections = arr;
        }
        else {
            int arr_length = this.familyConnections.length;
            FamilyRelation[] arr = new FamilyRelation[arr_length + 1];
            for(int i = 0; i < arr_length; i++) {
                arr[i] = this.familyConnections[i];
            }
            arr[arr_length] = record;
            this.familyConnections = arr;
        }
    }
    public void addMedicalRecord(MedicalRecord record) {
        if(medicalRecords == null) {
            MedicalRecord[] arr = new MedicalRecord[1];
            arr[0] = record;
            this.medicalRecords = arr;
        }
        else {
            int arr_length = this.medicalRecords.length;
            MedicalRecord[] arr = new MedicalRecord[arr_length + 1];
            for(int i = 0; i < arr_length; i++) {
                arr[i] = this.medicalRecords[i];
            }
            arr[arr_length] = record;
            this.medicalRecords = arr;
        }
    }

    // Remove Methods
    public void removePersonalBelonging(Supply unwantedSupply) {
        int arr_length = this.personalBelongings.length;
        Supply[] arr = new Supply[arr_length - 1];
        for(int i = 0, j = 0; i < arr_length && j < arr_length - 1; i++, j++) {
            if(this.personalBelongings[i] == unwantedSupply) {
                j--;
                continue;
            }
            arr[j] = this.personalBelongings[i];
        }
        this.personalBelongings = arr;
    }
    public void removeFamilyConnection(FamilyRelation exRelation) {
        int arr_length = this.familyConnections.length;
        FamilyRelation[] arr = new FamilyRelation[arr_length - 1];
        for(int i = 0, j = 0; i < arr_length && j < arr_length - 1; i++, j++) {
            if(this.familyConnections[i] == exRelation) {
                j--;
                continue;
            }
            arr[j] = this.familyConnections[i];
        }
        this.familyConnections = arr;
    }
    
    // Private Methods
    private static int generateSocialID() {
        return counter++;
    }
    private static boolean isValidDateFormat(String date) {
        String regex = "^([0-9]{4})-([0-9]{2})-([0-9]{2})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }   
    private static int convertDateStringToInt(String dateStr) {
        String[] values = dateStr.split("-");
        int year = Integer.parseInt(values[0]);
        int month = Integer.parseInt(values[1]);
        int day = Integer.parseInt(values[2]);
        return year + month + day;
    }
}
