package multithreading;

public class Main {

    static TaskService taskService = new TaskService();

    public static void main(String[] args) {
        taskService.simpleCycle();
        try {
            taskService.threadCycleWithMethod();
            taskService.threadCycleWithoutMethod();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}