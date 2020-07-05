package model;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class TodoTest
{
    /**
     * We are only going to do the basic tests, K I S S
     * Arrange
     * Act
     * Assert
     *
     */

Todo uppgift1 = new Todo(1, "jobba");

    @Test
    public void TestGetTodoId()
    {
        assertTrue(uppgift1.getTodoId() == 1 );
    }


    @Test
    public void TestGetDescription()
    {
        assertTrue(uppgift1.getDescription().equals("jobba"));
    }

}
