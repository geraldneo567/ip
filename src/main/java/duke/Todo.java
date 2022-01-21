package duke;

/**
 * Represents a <code>Todo</code> Task.
 */


public class Todo extends Task {

    public Todo(String name) {
        super(name, "T");
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

}
