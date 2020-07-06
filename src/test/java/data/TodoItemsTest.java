package data;

import model.Todo;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
public class TodoItemsTest {
    /**
     * We are only going to do the basic tests, K I S S
     * Arrange
     * Act
     * Assert
     */

    @Test
    public void TestClear() {
        // Arrange
        TodoSequencer.reset();
        TodoItems.Clear();
        // Act
        Todo task1 = TodoItems.CreateNewTodo("Work");
        Todo task2 = TodoItems.CreateNewTodo("Sleep");
        Todo task3 = TodoItems.CreateNewTodo("Eat");
        int arrayLength = TodoItems.size();
        TodoItems.Clear();
        // Assert
        assertTrue(arrayLength == 3 && TodoItems.size() == 0);
    }

    @Test
    public void TestFindTodoItemsById() {
        // Arrange
        TodoSequencer.reset();
        TodoItems.Clear();
        // Act
        Todo task1 = TodoItems.CreateNewTodo("Work");
        Todo task2 = TodoItems.CreateNewTodo("Sleep");
        Todo task3 = TodoItems.CreateNewTodo("Eat");
        // Assert
        assertTrue(TodoItems.findById(1003).equals(task3));
    }
}