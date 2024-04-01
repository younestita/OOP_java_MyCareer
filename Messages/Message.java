package Messages;
import java.util.Date;
import java.util.GregorianCalendar;

public class Message {
    public Date Date_time;
    public String message;
    public GregorianCalendar date_time;
    public Message (GregorianCalendar date, String msg) {
        this.Date_time=date.getTime();
        this.message=msg;
    }
    public GregorianCalendar getTime() {
        return date_time;
    }

    @Override
    public String toString() {
        return "Message{" +
                "Date_time=" + Date_time +
                ", message='" + message + '\'' +
                '}';
    }
}
