package Education;

public class Educational_Info {
    public LD latest_degree;
    public String discipline;
    public int grad_year;



    public Educational_Info(LD ld, String dspln, int gy) {
        this.latest_degree= ld;
        this.discipline=dspln;
        this.grad_year=gy;
    }

    @Override
    public String toString() {
        return "Educational_Info{" +
                "latest_degree=" + latest_degree +
                ", discipline='" + discipline + '\'' +
                ", grad_year=" + grad_year +
                '}';
    }

    public String Update_edu_info(int n, String updated) {
        if(n == 1)
            return String.valueOf(this.latest_degree = LD.valueOf(updated));
        if(n == 2)
            this.discipline=updated;
        if(n == 3)
            this.grad_year = Integer.valueOf(updated);


        return updated;
    }
}
