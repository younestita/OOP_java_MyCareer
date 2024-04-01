package Profile;

public class AccountArray {
	
		
		public  Account accounts[];
		
		public AccountArray()
		{
			accounts = new Account[4];
			accounts[0] = new Account("Jane", 19, "Ifrane", "ja.ne@gmail.com", "0600000000","jane19","jayne123");
			accounts[1] = new Account("Ahmed", 21, "Casa", "Ahmed21@gmail.com", "0602035001","AH_med","KJHG7iuoyh@");	
		}
		
		//Sign up
		public void register(Account A) throws AccountExistsException
		{
			for(Account ac : accounts)
			{
				if(ac.equals(ac))
				{
					AccountExistsException e = new AccountExistsException(ac);
					throw e;
				}
			}
			
			accounts[2] = A;
		}
		
		//Login
		public boolean login(String login, String password) throws AccountNotFoundException
		{
			for(Account u : accounts)
			{
				if(u!=null && u.getLogin().equals(login))
				{
					return u.getPass().equals(password);
				}
			}
			throw new AccountNotFoundException(login);
		}

	}


