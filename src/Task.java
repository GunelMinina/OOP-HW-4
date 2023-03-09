import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Timer;

public class Task {
    private Date startDate;
    private Date stopDate;
    private String topic;



    Task(String startDate, String stopDate, String topic) throws ParseException {
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");

        this.startDate = format.parse(startDate);
        this.stopDate = format.parse(stopDate);
        this.topic = topic;

    }

        public void getInfo() {
            System.out.println(this.startDate + " " + this.stopDate + " ");

    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getStopDate(){
        return stopDate;
    }
}
