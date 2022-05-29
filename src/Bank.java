
import java.util.ArrayList;

public class Bank {

	private String bnkName;															//Bank name variable
    private ArrayList<Account> accounts;											//Account class in ArrayList
    private int count;																//count variable for how many people are registering

    public Bank(){}																	//non-parameterized constructor

    /**
     * @param name: Bank Name
     * @param count: how many new registered are there
     */
    public Bank(String name, int count) {											//parameterized constructor
        this.bnkName = name;
        accounts =  new ArrayList<Account>(count);
    }

    private int accountType;														//account type variable
    public void whichAccount() {													//Method to select which account
        System.out.println("1. Chequing");
        System.out.println("2. Saving");
        System.out.print("Enter the type of account you want to create: ");
        accountType = BankTest.keys.nextInt();
    }

    public void printTitle(){														//Method to print the title
    	System.out.println("*************************************************************************************************************************");
    	System.out.printf("%45S BANK %n", bnkName);
    	System.out.println("*************************************************************************************************************************");
        System.out.printf("%s |%20s |%20s |%20s |%20s | %n","Acc Number","Name","Email","Phone Number","Balance");
        System.out.println("*************************************************************************************************************************");
    }

    /**
     * @category Ask user to select the account and base on the selection, program make next step
     */
	public void accountHoldersDetails(){											//Method to select for which account by user
        if (count>-1&&count<=(accounts.size())){
            whichAccount();
            while (accountType > -1){
            	while (accountType < 1|| accountType >2) {
            		System.out.println("Invalid account type... please re-enter");
            		whichAccount();
            	}
            	if (accountType==1) {											
            		Account CA = new Chequing();
                	CA.readDetails();
                	accounts.add(CA); 
            	}
            	if (accountType==2) {
            		Account SA = new Savings();
                	SA.readDetails();
                	accounts.add(SA); 
            	}
            	break;
            }
            count++;
        }
    }   
        

    public void runAccount() { 														//Method to update balance of both the accounts
    	if (count<=0){
        	System.out.println("No accounts to process");
        }
        else {
        	for(int i=0;i<accounts.size();i++){
        		accounts.get(i).updateAccBalance();
        	}
        }
    }
    
	public void printDetails(){														//Method to print detail of person who signed up
        if (count<=0) {
        	System.out.println("No account to display");
        }else {
        	printTitle();
        	for(int i=0;i<accounts.size();i++){
        		accounts.get(i).printDetails();
        	}
        }	
    }
}
