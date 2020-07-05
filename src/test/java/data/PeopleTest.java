package data;

import model.Person;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class PeopleTest {
    /**
     * We are only going to do the basic tests, K I S S
     * Arrange
     * Act
     * Assert
     *
     */

    Person theKing = new Person(1,"Elvis","Presley");
    Person theQueen = new Person(2,"Freddie","Mercury");
    Person theBoss = new Person(3, "Bruce", "Springsteen");
    Person[] peopleArray = {theKing, theQueen, theBoss};

    @Test
    public void TestLength()
    {
        assertTrue(peopleArray.length == 3);
    }

    @Test
    public void TestGet()
    {
        assertTrue(peopleArray[1].getPersonId() == 2);
    }
}
