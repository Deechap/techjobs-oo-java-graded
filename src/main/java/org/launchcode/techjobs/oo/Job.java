package org.launchcode.techjobs.oo;

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
//First constructor:
    public Job() {
        id = nextId;
        nextId++;
    }

    //Second constructor:
    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id && Objects.equals(name, job.name) && Objects.equals(employer, job.employer) && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType) && Objects.equals(coreCompetency, job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    //Getters and Setters for each field, except nextId and id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    //Getter for ID field
    public int getId() {
        return id;
    }

    //    testing for empty fields
    @Override
    public String toString() {
        if (getName() == "") {
            setName("Data not available");
        }
        if (getEmployer().getValue() == "") {
            employer.setValue("Data not available");
        }
        if (getLocation().getValue() == "") {
            location.setValue("Data not available");
        }
        if (getPositionType().getValue() == "") {
            positionType.setValue("Data not available");
        }
        if (getCoreCompetency().getValue() == "") {
            coreCompetency.setValue("Data not available");
        }
//        not sure where to go from here
        return "\n" +
                "ID: " = getId() + '\n' +
                "Name: " + getName() + '\n' +
                "Employer: " + getEmployer() + '\n' +
                "Position Type: " + getPositionType() + '\n' +
                "Core Competency: " + getCoreCompetency() + '\n';
    }
}
