package model;

import data.PersonSequencer;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PersonTest
{
    /**
     * We are only going to do the basic tests, K I S S
     * Arrange
     * Act
     * Assert
     */

    @Test
    public void TestGetPersonId() {
        // Arrange
        PersonSequencer.reset();
        // Act
        Person theKing = new Person("Elvis","Presley");
        Person theQueen = new Person("Freddie","Mercury");
        Person theBoss = new Person("Bruce", "Springsteen");
        // Assert
        assertTrue((theKing.getPersonId() == 101) && (theQueen.getPersonId() == 102) &&
        (theBoss.getPersonId() == 103));
    }

    @Test
    public void TestGetNames() {
        // Arrange
        PersonSequencer.reset();
        // Act
        Person theKing = new Person("Elvis","Presley");
        Person theQueen = new Person("Freddie","Mercury");
        Person theBoss = new Person("Bruce", "Springsteen");
        String firstKing = theKing.getFirstName();
        theKing.setFirstName("Michael");
        theKing.setLastName("Jackson");
        // Assert
        assertTrue((firstKing.equals("Elvis")) && (theKing.getLastName().equals("Jackson")) &&
                (theQueen.getFirstName().equals("Freddie")) && (theBoss.getLastName().equals("Springsteen")));
    }
}
