package model;

import data.TodoSequencer;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TodoTest
{
    /**
     * We are only going to do the basic tests, K I S S
     * Arrange
     * Act
     * Assert
     */

    @Test
    public void TestGetTodoId1()
    {
        // Arrange
        TodoSequencer.reset();
        // Act
        Todo task1 = new Todo("Work");
        Todo task2 = new Todo("Sleep");
        Todo task3 = new Todo("Eat");
        // Assert
        assertTrue(task1.getTodoId() == 1001);
    }
    @Test
    public void TestGetTodoId2()
    {
        // Arrange
        TodoSequencer.reset();
        // Act
        Todo task1 = new Todo("Work");
        Todo task2 = new Todo("Sleep");
        Todo task3 = new Todo("Eat");
        // Assert
        assertTrue(task2.getTodoId() == 1002);
    }

    @Test
    public void TestGetTodoId3()
    {
        // Arrange
        TodoSequencer.reset();
        // Act
        Todo task1 = new Todo("Work");
        Todo task2 = new Todo("Sleep");
        Todo task3 = new Todo("Eat");
        // Assert
        assertTrue(task3.getTodoId() == 1003);
    }

    @Test
    public void TestGetDescription1()
    {
        // Arrange
        TodoSequencer.reset();
        // Act
        Todo task1 = new Todo("Work");
        Todo task2 = new Todo("Sleep");
        Todo task3 = new Todo("Eat");
        // Assert
        assertTrue(task1.getDescription().equals("Work"));
    }
}
