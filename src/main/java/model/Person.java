package model;

public class Person {
    private final int personId;
    private String firstName;
    private String lastName;

    public Person(int personId, String firstName, String lastName) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getPersonId() { // we need to read personId
        return personId;
    }
                                // we have no setPersonId because it is set only once

    public String getFirstName() { // we need to read the name
        return firstName;
    }

    public void setFirstName(String firstName) { // We need to set the name
        this.firstName = firstName;
    }

    public String getLastName() { // we need to read the name
        return lastName;
    }

    public void setLastName(String lastName) { // We need to set the name
        this.lastName = lastName;
    }
}
