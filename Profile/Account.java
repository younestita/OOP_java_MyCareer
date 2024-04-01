package Profile;

public class Account extends Profile {

   
	private String login;
    private String password;
    public Account (String name, int age, String address, String email, String phone,String login, String password) {
    	super(name,age,address, email, phone);
        this.login= login;
        this.password= password;

    }
  


    public String getLogin() {
        return login;
    }
    public void setLogin(String lgn) {
        this.login=lgn;

    }
    public String getPass() {
        return password;
    }
    public void Change_Pass(String pwd) {
        this.password=pwd;

    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Account{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

