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
    public void TestGetPersonId1()
    {
        // Arrange
        PersonSequencer.reset();
        // Act
        Person theKing = new Person("Elvis","Presley");
        Person theQueen = new Person("Freddie","Mercury");
        Person theBoss = new Person("Bruce", "Springsteen");
        // Assert
        assertTrue(theKing.getPersonId() == 101);
    }

    @Test
    public void TestGetPersonId2()
    {
        // Arrange
        PersonSequencer.reset();
        // Act
        Person theKing = new Person("Elvis","Presley");
        Person theQueen = new Person("Freddie","Mercury");
        Person theBoss = new Person("Bruce", "Springsteen");
        // Assert
        assertTrue(theQueen.getPersonId() == 102);
    }
    @Test
    public void TestGetPersonId3()
    {
        // Arrange
        PersonSequencer.reset();
        // Act
        Person theKing = new Person("Elvis","Presley");
        Person theQueen = new Person("Freddie","Mercury");
        Person theBoss = new Person("Bruce", "Springsteen");
        // Assert
        assertTrue(theBoss.getPersonId() == 103);
    }

    @Test
    public void TestGetFirstName1()
    {
        // Arrange
        PersonSequencer.reset();
        // Act
        Person theKing = new Person("Elvis","Presley");
        Person theQueen = new Person("Freddie","Mercury");
        Person theBoss = new Person("Bruce", "Springsteen");
        // Assert
        assertTrue(theKing.getFirstName().equals("Elvis"));
    }

    @Test
    public void TestGetLastName2()
    {
        // Arrange
        PersonSequencer.reset();
        // Act
        Person theKing = new Person("Elvis","Presley");
        Person theQueen = new Person("Freddie","Mercury");
        Person theBoss = new Person("Bruce", "Springsteen");
        // Assert
        assertTrue(theQueen.getLastName().equals("Mercury"));
    }

    @Test
    public void TestGetFirstName3()
    {
        // Arrange
        PersonSequencer.reset();
        // Act
        Person theKing = new Person("Elvis","Presley");
        Person theQueen = new Person("Freddie","Mercury");
        Person theBoss = new Person("Bruce", "Springsteen");
        // Assert
        assertTrue(theBoss.getFirstName().equals("Bruce"));
    }
}