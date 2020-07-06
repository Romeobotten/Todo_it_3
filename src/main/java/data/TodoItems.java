package data;

import model.Person;
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

    public static Todo[] findByDoneStatus(boolean doneStatus){
        Todo[] doneStatusArray = new Todo[0];
        for (int i = 0; i < size(); i++) {
            if (todoArray[i].isDone() == doneStatus) {
                doneStatusArray = Arrays.copyOf(doneStatusArray, doneStatusArray.length + 1);
                doneStatusArray[doneStatusArray.length - 1] = todoArray[i];
            }
        }
        return doneStatusArray;
    }

    public static Todo[] findByAssignee(int personId){
        Todo[] assigneeArray = new Todo[0];
        for (int i = 0; i < size(); i++) {
            if (todoArray[i].getAssignee().getPersonId() == personId) {
                assigneeArray = Arrays.copyOf(assigneeArray, assigneeArray.length + 1);
                assigneeArray[assigneeArray.length - 1] = todoArray[i];
            }
        }
        return assigneeArray;
    }

    public static Todo[] findByAssignee(Person assignee){
        Todo[] assigneeArray = new Todo[0];
        for (int i = 0; i < size(); i++) {
            if (todoArray[i].getAssignee().equals(assignee)) {
                assigneeArray = Arrays.copyOf(assigneeArray, assigneeArray.length + 1);
                assigneeArray[assigneeArray.length - 1] = todoArray[i];
            }
        }
        return assigneeArray;
    }

    public static Todo[] findUnassignedTodoItems(){
        Todo[] unassignedArray = new Todo[0];
        for (int i = 0; i < size(); i++) {
            if (todoArray[i].getAssignee() == null) {
                unassignedArray = Arrays.copyOf(unassignedArray, unassignedArray.length + 1);
                unassignedArray[unassignedArray.length - 1] = todoArray[i];
            }
        }
        return unassignedArray;
    }
}
