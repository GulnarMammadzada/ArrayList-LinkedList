package package2;

import java.util.Objects;

public class Task {
    String taskName;
    String deadline;

    public Task(String deadline, String taskName) {
        this.deadline = deadline;
        this.taskName = taskName;
    }

    @Override
    public String toString() {
        return "Task{" +
                "deadline='" + deadline + '\'' +
                ", taskName='" + taskName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(taskName, task.taskName) && Objects.equals(deadline, task.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, deadline);
    }
}
