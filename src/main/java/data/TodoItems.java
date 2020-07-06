package data;

import model.Todo;

import java.util.Arrays;

public class TodoItems {

    private static Todo[] todoArray = new Todo[0]; // An Array of Things to do

    public static int size() {
        return todoArray.length;
    }

    public static Todo[] findAll() {
        return todoArray;
    }

    public static Todo findById(int TodoId) {
        for (int i = 0; i < size(); i++) {
            if (todoArray[i].getTodoId() == TodoId) {
                return todoArray[i];
            }
        }
        return null;
    }

    public static Todo CreateNewTodo(String description) {
        todoArray = Arrays.copyOf(todoArray,size() + 1);
        todoArray[size() - 1] = new Todo(description);
        return todoArray[size() - 1];
    }

    public static void Clear() {
        todoArray = Arrays.copyOf(todoArray, 0);
    }
}
