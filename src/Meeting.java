import java.sql.Time;
import java.text.ParseException;
import java.util.Date;

public class Meeting extends Task {

private String priority;

private String member;


    Meeting(String startDate, String stopDate, String priority, String topic, String member) throws ParseException {
        super(startDate, stopDate, topic);
        this.priority = priority;
        this.member = member;

    }

    @Override
    public void getInfo() {
        System.out.println("Встреча (" + this.priority + "): с " + this.getStartDate() + " по " + this.getStopDate());
        System.out.println("Участники " + this.member);
    }
}
