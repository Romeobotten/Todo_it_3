package model;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class PersonTest
{
    /**
     * We are only going to do the basic tests, K I S S
     * Arrange
     * Act
     * Assert
     *
     */

    Person theKing = new Person(1,"Elvis","Presley");
    Person theQueen = new Person(2,"Freddie","Mercury");

    @Test
    public void TestGetPersonId()
    {
        assertTrue(theKing.getPersonId() == 1 );
    }

    @Test
    public void TestGetFirstName()
    {
        assertTrue(theKing.getFirstName().equals("Elvis"));
    }

    @Test
    public void TestGetLastName()
    {
        assertTrue(theQueen.getLastName().equals("Mercury"));
    }
    @Test
    public void TestGetPersonId2()
    {
        assertTrue(theQueen.getPersonId() == 2 );
    }

}
