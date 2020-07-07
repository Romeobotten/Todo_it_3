package data;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TodoSequencerTest
{
    /**
     * We are only going to do the basic tests, K I S S
     * Arrange
     * Act
     * Assert
     */

    @Test
    public void TestTodoSequencer() {
        // Arrange
        TodoSequencer.reset();
        // Act
        int todoId1001 = TodoSequencer.nextTodoId();
        int todoId1002 = TodoSequencer.nextTodoId();
        TodoSequencer.reset();
        int todoId1003 = TodoSequencer.nextTodoId();
        // Assert
        assertTrue((todoId1001 == 1001) && (todoId1002 == 1002) && (todoId1003 == 1001));
    }
}
