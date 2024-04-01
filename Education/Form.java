package Education;

public class Form {
    public String Education,Experience, Skills;

    public Form(String edc,String exp, String skl) {
        this.Education=edc;
        this.Experience=exp;
        this.Skills=skl;
    }

    @Override
    public String toString() {
        return "Form{" +
                "Education='" + Education + '\'' +
                ", Experience='" + Experience + '\'' +
                ", Skills='" + Skills + '\'' +
                '}';
    }
}

