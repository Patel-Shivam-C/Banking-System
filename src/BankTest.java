import java.util.Scanner;

public class BankTest {

	public static Scanner keys = new Scanner(System.in);							//scanner class
    private static int options;														//option variable
    public static  void whatToDo() {													//Method to provide options to user and give freedom to make decision
        System.out.println("1. Read Account");
        System.out.println("2. Run monthly process");
        System.out.println("3. Print all Accounts");
        System.out.println("4. Exit");
        System.out.print("Enter your option: ");
        options = keys.nextInt();
    }

	public static void main(String[] args) {
		String bankName;															//Bank name variable
        int noOfAccounts;															//number of account variable

        System.out.print("Enter the name of the bank: ");							//ask user to enter bank name
        bankName = keys.nextLine();
        System.out.print("How many account holders do you have: ");					//ask user to enter number of account
        noOfAccounts = keys.nextInt();

        Bank bank = new Bank(bankName, noOfAccounts);								//object of bank class

        /**
         * @author Owner:Us
				 er can make their choice and do what they want to do
         */
        whatToDo();																	//calling whatToDo method
        while(options >-1){															//by using while loop and switch statement asking user what they want to do
            switch(options) {
                case 1:
                    bank.accountHoldersDetails();
                    whatToDo();
                    break;
                case 2:
                	bank.runAccount();
                	whatToDo();
                	break;
                case 3:
                    bank.printDetails();
                    whatToDo();
                    break;
                case 4:
//                	System.out.println("Thanks for creating accounts... \nProgram by Shivam Patel");
                	break;
                default:
                    System.out.println("Invalid option... please select again");
                    whatToDo();
            }
            if (options == 4) {
            	System.out.println("Thanks for creating accounts... \nProgram by Shivam Patel");
            	break;
            }
        }
        keys.close();																//scanner class close
	}
}
