package Profile;

public class Company {
    public String name;
    public String description;
    public String activity;

    public Company (String name,String description,String activity ) {
        this.name= name;
        this.description = description;
        this.activity= activity;
    }

    @Override
    public String toString() {
        return "Company{" + "name='" + name + '\'' + ", description='" + description + '\'' + ", activity='" + activity + '\'' + '}';
    }
}
