package data;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class PersonSequencerTest
{
    /**
     * We are only going to do the basic tests, K I S S
     * Arrange
     * Act
     * Assert
     *
     */

    @Test
    public void TestPersonSequencer()
    {
        PersonSequencer.reset();
        int personId = PersonSequencer.nextPersonId();
        assertTrue(personId == 1);
    }

}
