package data;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class TodoSequencerTest
{
    /**
     * We are only going to do the basic tests, K I S S
     * Arrange
     * Act
     * Assert
     *
     */

    @Test
    public void TestTodoSequencer()
    {
        TodoSequencer.reset();
        int todoId = TodoSequencer.nextTodoId();
        assertTrue(todoId == 1);
    }

}
