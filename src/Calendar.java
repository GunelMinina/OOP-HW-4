import java.util.ArrayList;
import java.util.Date;

public class Calendar<T extends Task> {
    private ArrayList<T> taskList = new ArrayList<>();

    public Calendar() {
    }

    public ArrayList<T> getTaskList() {
        return taskList;
    }

    public void setTaskList(ArrayList<T> fruitList) {
        this.taskList = taskList;
    }

    public void addTask(T task) {
        this.taskList.add(task);
    }

    public void showTodayTasks() {
        Date todayDate = new Date();
        for (T task: this.taskList){
            if (task.getStartDate().before(todayDate) && task.getStopDate().after(todayDate)) {
                task.getInfo();
            }

            }
    }


    @Override
    public String toString() {
        return "Calendar{" +
                "taskList=" + taskList +
                '}';
    }
}

