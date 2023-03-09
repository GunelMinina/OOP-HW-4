import java.text.ParseException;
import java.util.Date;

public class Develope extends Task {
    private String release;
    private String responsible;

    Develope(String startDate, String stopDate, String topic, String release, String responsible) throws ParseException {
        super(startDate, stopDate, topic);
        this.release = release;
        this.responsible = responsible;
    }

    @Override
    public void getInfo() {
        System.out.println("Разработка (релиз " + this.release + "): с " + this.getStartDate() + " по " + this.getStopDate());
        System.out.println("Исполнитель " + this.responsible);
    }
}
