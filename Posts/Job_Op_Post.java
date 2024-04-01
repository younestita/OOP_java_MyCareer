package Posts;

import java.util.Date;

public class Job_Op_Post extends Post {
    public String Job_title;
    public double Salary;
    public Date Start_date;

    public Job_Op_Post(Date date, String pst, String jt, double slr, Date sd, int like){
        super(date, pst, like);
        this.Job_title=jt;
        this.Salary=slr;
        this.Start_date=sd;
    }

    @Override
    public String toString() {
        return "Job_Op_Post{" +
                "Job_title='" + Job_title + '\'' +
                ", Salary=" + Salary +
                ", Start_date=" + Start_date +
                '}';
    }
}
