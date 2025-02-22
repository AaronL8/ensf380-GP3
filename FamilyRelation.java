package edu.ucalgary.oop;

public class FamilyRelation {
    private DisasterVictim personOne;
    private String relationshipTo;
    private DisasterVictim personTwo;

    // Constructor
    public FamilyRelation(DisasterVictim personOne, String relationshipTo, DisasterVictim personTwo) {
        this.personOne = personOne;
        this.relationshipTo = relationshipTo;
        this.personTwo = personTwo;
    }

    // Getters
    public DisasterVictim getPersonOne() {
        return this.personOne;
    }
    public DisasterVictim getPersonTwo() {
        return this.personTwo;
    }
    public String getRelationshipTo() {
        return this.relationshipTo;
    }

    // Setters
    public void setPersonOne(DisasterVictim personOne) {
        this.personOne = personOne;
    }
    public void setRelationshipTo(String relationshipTo) {
        this.relationshipTo = relationshipTo;
    }
    public void setPersonTwo(DisasterVictim personTwo) {
        this.personTwo = personTwo;
    }
}
