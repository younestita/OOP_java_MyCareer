import java.util.Scanner;

import javax.security.auth.login.AccountNotFoundException;

import Education.Educational_Info;
import Education.LD;
import Profile.Account;
import Profile.AccountArray;
import Profile.AccountExistsException;
import Profile.Company;
import Profile.Profile;
public class MyCareerApp {
	static AccountArray accounts;
	public static void main(String[] args)throws AccountNotFoundException {
        Scanner sc = new Scanner(System.in);
        int answer;
        int resp;
        int n;
        String Updated;
        do {
    		System.out.println("---------- Menu ----------");
    		System.out.println("1. Login");
    		System.out.println("2. Sign Up");
    		System.out.println("3. Quit");
    		System.out.println("Please enter your choice: ");
    		answer = sc.nextInt();
    		
    		switch(answer)
    		{
    		case 1:
            System.out.println("Please enter your login :");
            String login = sc.next();
            System.out.println("Please enter your password:");
            String password = sc.next();
            
            try {
				accounts.login(login, password);
			}
			catch(AccountNotFoundException e)
			{
				System.out.println(e.getMessage());
			}

        break;
    		case 2:
            int choice;
            System.out.println("Select your category: 1) User / 2) Company : ");
            choice = Integer.parseInt(sc.next());
            if (choice == 1) {
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Age: ");
                int age = Integer.parseInt(sc.next());
                System.out.println("Address: ");
                String address = sc.next();
                System.out.println("Email: ");
                String Email = sc.next();
                System.out.println("Phone: ");
                String Phone = sc.next();
                System.out.println("Please enter your login :");
                String login1 = sc.next();
                System.out.println("Please enter your password:");
                String password1 = sc.next();
                Profile P = new Profile(name, age, address, Email, Phone);
                System.out.println(P);
                Account u = new Account(name, age,address,Email,Phone, login1, password1);
    			try {
    				accounts.register(u);
    			}
    			catch(AccountExistsException e)
    			{
    				System.out.println(e.getMessage());
    				
    			}
                System.out.println("Do you want to make a change in your profile? (1. YES, 2.NO) : ");
                resp = Integer.parseInt(sc.next());
                while(resp == 1){
                 System.out.println("change: 1.name, 2.age, 3.Address, 4 Email, 5. Phone: ");
                    n= Integer.parseInt(sc.next());
                    System.out.println("input the new value: ");
                    Updated=sc.next();
                    System.out.println("this is your new value:"+P.Update_profile(n, Updated));
                    System.out.println(P);
                    System.out.println("Do you want to make a change in your profile? (1. YES, 2.NO) : ");
                    resp = Integer.parseInt(sc.next());


                }

                System.out.println("Enter your latest degree (BACHELOR, MASTER, PHD) :     ");
                LD ld = LD.valueOf(sc.next().toUpperCase());
                try {
                validateED(ld);
                }
                catch(InvalidDegreeException e) {
                	System.out.println("Warning !!"+e);
                }
                System.out.println("Enter your discipline: ");
                String discipline = sc.next();
                System.out.println("Enter your graduation year: ");
                int grad_year = sc.nextInt();
                Educational_Info EI = new Educational_Info(ld, discipline, grad_year);
                System.out.println(EI);
               
                
               
                System.out.println("Do you want to change your educational information? (1. YES, 2.NO) : ");
                resp = Integer.parseInt(sc.next());
                while(resp == 1) {
                    System.out.println("change: 1.latest degree, 2.discipline, 3.graduation year: ");
                    n = Integer.parseInt(sc.next());
                    if (n == 1) {
                        System.out.println("choose one of these values (BACHELOR, MASTER, PHD): ");
                        Updated = sc.next();
                    } else {
                        System.out.println("input the new value: ");
                        Updated = sc.next();
                    }
                    System.out.println(EI.Update_edu_info(n, Updated));
                    System.out.println(EI);
                    System.out.println("Do you want to change your educational information? (1. YES, 2.NO) : ");
                    resp = sc.nextInt();
                }
                
                System.out.println("Signed Up Successfully !");
                System.out.println("Please enter your login :");
                String login2= sc.next();
                System.out.println("Please enter your password:");
                String password2 = sc.next();
                try {
    				accounts.login(login1, password2);
    			}
    			catch(AccountNotFoundException e)
    			{
    				System.out.println(e.getMessage());
    			}

            }
                 if (choice == 2) {
                    System.out.println("Name of the company: ");
                    String Company_name = sc.next();
                    System.out.println("Description: ");
                    String Description = sc.next();
                    System.out.println("Activity: ");
                    String Activity = sc.next();
                    Company C = new Company(Company_name, Description, Activity);
                    System.out.println(C);
                     System.out.println("Signed Up Successfully !");
                    
                }

            break;
            
    		case 3: 
    			System.exit(0);
    			default:
    				System.out.println("Invalid input!");
    				break;
    		
    		}
    		}while(answer!=3);


    }
   
	public static void validateED (LD ld) throws InvalidDegreeException {
		if (ld== LD.BACHELOR || ld== LD.MASTER || ld==LD.PHD ) {
			System.out.println("valid");
		}
		else {
			throw new InvalidDegreeException();
		}	
	
}

}




