import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        Calendar<Task> calendar = new Calendar<Task>();

        try {
            Meeting meeting1 = new Meeting("09.03.2023 10:00", "09.03.2023 23:59", "Важное", "Совещание по безопасности", "Иванов, Петров, Сидоров");
            Meeting meeting2 = new Meeting("10.03.2023 10:00", "10.03.2023 23:59", "Не важное", "Совещание по бюджету", "Иванов, Сидоров");

            Develope devTask1 = new Develope("10.03.2023 10:00", "10.03.2023 23:59", "Разработка личного кабинета", "release-1", "Петров");
            Develope devTask2 = new Develope("08.03.2023 10:00", "12.03.2023 23:59", "Разработка системы оплаты", "release-2", "Иванов");

            calendar.addTask(meeting1);
            calendar.addTask(meeting2);
            calendar.addTask(devTask1);
            calendar.addTask(devTask2);

            System.out.println("Задачи на сегодня:");
            calendar.showTodayTasks();

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}


   // SimpleDateFormat formatForDate = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");