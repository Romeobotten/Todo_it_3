package data;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class PersonSequencerTest {
    /**
     * We are only going to do the basic tests, K I S S
     * Arrange
     * Act
     * Assert
     */

    @Test
    public void TestPersonSequencer() {
        // Arrange
        PersonSequencer.reset();
        // Act
        int personId101 = PersonSequencer.nextPersonId();
        int personId102 = PersonSequencer.nextPersonId();
        PersonSequencer.reset();
        int personId103 = PersonSequencer.nextPersonId();
        // Assert
        assertTrue((personId101 == 101) && (personId102 == 102) && (personId103 == 101));
    }
}
