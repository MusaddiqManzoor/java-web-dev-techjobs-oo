package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        if (this.name.equals("")) {
            this.setName("Data Not Available: ");
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {

        if (this.employer.getValue().equals("")) {
            employer.setValue("Data Not Available: ");
        }
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {

        if (this.location.getValue().equals("")) {
            location.setValue("Data Not Available: ");
        }
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        if (this.positionType.getValue().equals("")) {
            positionType.setValue("Data Not Available: ");
        }
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        if (this.positionType.getValue().equals("")) {
            positionType.setValue("Data Not Available: ");
        }
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        if (this.coreCompetency.getValue().equals("")) {
            coreCompetency.setValue("Data Not Available: ");
        }
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    @Override
    public String toString() {

        return "\n" + "ID: " + this.getId() + "\n" +
                "Name: " + this.getName() + "\n" +
                "Employer: " + this.getEmployer() + "\n" +
                "Location: " + this.getLocation() + "\n" +
                "Position Type: " + this.getPositionType() + "\n" +
                "Core Competency: " + this.getCoreCompetency() + "\n";
    }

}
