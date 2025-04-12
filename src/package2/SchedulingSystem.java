package package2;

import java.util.LinkedList;

public class SchedulingSystem {
    public static void main(String[] args) throws InterruptedException {

        LinkedList<Task> taskList = new LinkedList<>();

        taskList.add(new Task("Complete project documentation", "2025-04-20"));
        taskList.add(new Task("Prepare client presentation", "2025-04-18"));
        taskList.add(new Task("Debug application", "2025-04-15"));
        taskList.add(new Task("Implement new features", "2025-04-17"));
        taskList.add(new Task("Code review", "2025-04-16"));

        taskList.addFirst(new Task("Urgent bug fix", "2025-04-13"));
        System.out.println("Updated Task List after adding high-priority task:");
        displayTasks(taskList);


        System.out.println("Processing tasks...");
        while (!taskList.isEmpty()) {
            Task completedTask = taskList.removeFirst();
            System.out.println("Completed: " + completedTask);

            Thread.sleep(5000);

            if (!taskList.isEmpty()) {
                System.out.println("Remaining Tasks:");
                displayTasks(taskList);
            }
        }

        System.out.println("All tasks have been completed successfully!");
    }

        public static void displayTasks(LinkedList<Task> tasks) {
            for (Task task : tasks) {
                System.out.println( task);
            }
        }


    }





