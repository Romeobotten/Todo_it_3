package model;

import data.PersonSequencer;

public class Person {
    private final int personId;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.personId = PersonSequencer.nextPersonId();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getPersonId() { // we need to read personId
        return this.personId;
    }
                                // we have no setPersonId because it is set only once

    public String getFirstName() { // we need to read the name
        return this.firstName;
    }

    public void setFirstName(String firstName) { // We need to set the name
        this.firstName = firstName;
    }

    public String getLastName() { // we need to read the name
        return this.lastName;
    }

    public void setLastName(String lastName) { // We need to set the name
        this.lastName = lastName;
    }

}
