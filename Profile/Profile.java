package Profile;

public class Profile {
    public String name;
    public int age;
    public String address;
    public String email;
    public String phone;

    public Profile(String name, int age, String address, String email, String phone) {

        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.phone = phone;

    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Profile{" +
                "Name='" + name + '\'' +
                ", Age=" + age +
                ", Address='" + address + '\'' +
                ", Email='" + email + '\'' +
                ", Phone='" + phone + '\'' +
                '}';
    }

    public String Update_profile(int n, String updated) {

            if (n == 1)
                this.name = updated;
            if (n == 2)
                this.age = Integer.valueOf(updated);
            if (n == 3)
                this.address = updated;
            if (n == 4)
                this.email = updated;
            if (n == 5)
                this.phone = updated;


        return updated;
    }
}



