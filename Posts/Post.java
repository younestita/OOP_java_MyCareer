package Posts;

import java.util.GregorianCalendar;

public class Post {
    public long Date;
    public String post;
    public GregorianCalendar date_time;
    public int like = 0;
    public Post(java.util.Date date, String pst, int like){
        this.Date= date.getTime();
        this.post=pst;
        this.like =like;
    }
    public GregorianCalendar getTime(){
        return date_time;
    }
    public void like(){
            like++;
    }
    public void search(){

    }

    @Override
    public String toString() {
        return "Post{" +
                "Date_time=" + Date +
                ", post='" + post + '\'' +
                ", like=" + like +
                '}';
    }
}
