import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3

    public TaskManager() {
        // Initialize tasks list
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        //throw new UnsupportedOperationException("Implement this method!");
    }

    public List<String> listTasks() {
        if (tasks.isEmpty() || tasks == null) {
            System.out.println("No tasks found");
        } else {
            for (String task : tasks) {
                System.out.println(task);
            }
        }
        //throw new UnsupportedOperationException("Implement this method!");
        return tasks;
    }

    public void deleteTask(String task){
//        leave for iteration 4
    }

    public void exit() {
        // leave for iteration 2f
    }
}