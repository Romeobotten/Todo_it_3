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
        Todo task1 = TodoItems.createNewTodo("Work");
        Todo task2 = TodoItems.createNewTodo("Sleep");
        Todo task3 = TodoItems.createNewTodo("Eat");
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
        Todo task1 = TodoItems.createNewTodo("Work");
        Todo task2 = TodoItems.createNewTodo("Sleep");
        Todo task3 = TodoItems.createNewTodo("Eat");
        // Assert
        assertTrue(TodoItems.findById(1003).equals(task3));
    }

    @Test
    public void TestFindByDoneStatus() {
        // Arrange
        TodoSequencer.reset();
        TodoItems.Clear();
        // Act
        Todo task1 = TodoItems.createNewTodo("Work");
        Todo task2 = TodoItems.createNewTodo("Sleep");
        Todo task3 = TodoItems.createNewTodo("Eat");
        // Assert
        assertTrue(!TodoItems.findByDoneStatus(false)[2].isDone());
    }

    @Test
    public void TestFindUnassignedTodoItems() {
        // Arrange
        TodoSequencer.reset();
        TodoItems.Clear();
        // Act
        Todo task1 = TodoItems.createNewTodo("Work");
        Todo task2 = TodoItems.createNewTodo("Sleep");
        Todo task3 = TodoItems.createNewTodo("Eat");
        // Assert
        assertTrue(TodoItems.findUnassignedTodoItems()[2].getDescription() == "Eat");
    }

    @Test
    public void TestRemoveTodoItems() {
        // Arrange
        TodoSequencer.reset();
        TodoItems.Clear();
        // Act
        Todo task1 = TodoItems.createNewTodo("Work");
        Todo task2 = TodoItems.createNewTodo("Sleep");
        Todo task3 = TodoItems.createNewTodo("Eat");
        TodoItems.removeTodoItem(1002);
        Todo task4 = TodoItems.createNewTodo("Drink");
        // Assert
        assertTrue((TodoItems.findById(1004).getDescription() == "Drink") &&
                (TodoItems.size() == 3) && (TodoItems.findById(1002) == null));
    }
}
