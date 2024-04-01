package Profile;

public class AccountExistsException extends Exception{
public Account A;
	
	public AccountExistsException(Account A)
	{
		super("The Account "+A+" already exists!");
		this.A = A;
	}
	

}
