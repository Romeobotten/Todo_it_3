package data;

import model.Person;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
public class PeopleTest {
    /**
     * We are only going to do the basic tests, K I S S
     * Arrange
     * Act
     * Assert
     */

    @Test
    public void TestArrayLength()
    {
        // Arrange
        PersonSequencer.reset();
        People.Clear();
        // Act
        Person theKing = new Person("Elvis","Presley");
        Person theQueen = new Person("Freddie","Mercury");
        Person theBoss = new Person("Bruce", "Springsteen");
        Person[] peopleArray = {theKing, theQueen, theBoss};
        // Assert
        assertTrue(peopleArray.length == 3);
    }

    @Test
    public void TestClear()
    {
        // Arrange
        PersonSequencer.reset();
        People.Clear();
        // Act
        Person theKing = People.CreateNewPerson("Elvis","Presley");
        Person theQueen = People.CreateNewPerson("Freddie","Mercury");
        Person theBoss = People.CreateNewPerson("Bruce", "Springsteen");
        int arrayLength = People.size();
        People.Clear();
        // Assert
        assertTrue(arrayLength == 3 && People.size() == 0);
    }

    @Test
    public void TestFindPersonById()
    {
        // Arrange
        PersonSequencer.reset();
        People.Clear();
        // Act
        Person theKing = People.CreateNewPerson("Elvis","Presley");
        Person theQueen = People.CreateNewPerson("Freddie","Mercury");
        Person theBoss = People.CreateNewPerson("Bruce", "Springsteen");
        // Assert
        assertTrue(People.findById(103).equals(theBoss));
    }
}
