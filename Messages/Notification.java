package Messages;

import java.util.Date;
import java.util.GregorianCalendar;

public class Notification {
    public Date Date_time;
    public String text;
    public GregorianCalendar date_time;
    public Notification (GregorianCalendar date,Date dt, String txt) {
        this.Date_time=date.getTime();
        this.text=txt;
    }
    public GregorianCalendar getTime() {
        return date_time;
    }
    @Override
    public String toString() {
        return "Notification{" +
                "Date_time=" + Date_time +
                ", text='" + text + '\'' +
                '}';
    }
}
