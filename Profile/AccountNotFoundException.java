package Profile;

public class AccountNotFoundException extends Exception{

	
	public String login;
	
	public AccountNotFoundException(String login)
	{
		super("The username: "+login+" does not exist! try to sign up");
		this.login = login;
	}
}

