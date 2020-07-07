package model;

import data.TodoSequencer;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TodoTest {
    /**
     * We are only going to do the basic tests, K I S S
     * Arrange
     * Act
     * Assert
     */

    @Test
    public void TestGetTodoId()
    {
        // Arrange
        TodoSequencer.reset();
        // Act
        Todo task1 = new Todo("Work");
        Todo task2 = new Todo("Sleep");
        Todo task3 = new Todo("Eat");
        // Assert
        assertTrue((task1.getTodoId() == 1001) && (task2.getTodoId() == 1002) &&
                (task3.getTodoId() == 1003));
    }

    @Test
    public void TestGetDescription()
    {
        // Arrange
        TodoSequencer.reset();
        // Act
        Todo task1 = new Todo("Work");
        Todo task2 = new Todo("Sleep");
        Todo task3 = new Todo("Eat");
        String doneSleeping = task2.getDescription();
          task2.setDescription("Drink");
        // Assert
        assertTrue((task1.getDescription().equals("Work")) && (doneSleeping.equals("Sleep")) &&
                (task2.getDescription().equals("Drink")) && (task3.getDescription().equals("Eat")));
    }

    @Test
    public void TestDone()
    {
        // Arrange
        TodoSequencer.reset();
        // Act
        Todo task1 = new Todo("Work");
        task1.setDone(true);

        // Assert
        assertTrue(task1.isDone());
    }

    @Test
    public void TestAssign()
    {
        // Arrange
        TodoSequencer.reset();
        // Act
        Todo task1 = new Todo("Work");
        Person programmer = new Person("Steve","Wozniak");
        task1.setAssignee(programmer);

        // Assert
        assertTrue(task1.getAssignee().getFirstName().equals("Steve"));
    }
}
