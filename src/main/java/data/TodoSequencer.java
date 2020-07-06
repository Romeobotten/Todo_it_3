package data;

public class TodoSequencer {
    private static int todoId = 1000;

    public static int nextTodoId(){
    todoId++;
    return todoId;
    }
    public static void reset(){
    todoId = 1000;
}
}
