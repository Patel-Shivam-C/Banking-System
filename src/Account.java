
abstract public class Account {

	protected int accountNumber;																				//account number variable
    protected Person accHolder;																					//Person class object
    protected double balance;																					//Balance variable

    public Account(){}																							//non-parameterized constructor

    /**
     * @param accNum: Account Number
     * @param name1: first name
     * @param name2: last name
     * @param email: Email
     * @param cellNum: Cell phone
     * @param balance: balance
     */
    public Account(int accNum, String name1, String name2, String email, long cellNum, double balance) {		//parameterized constructor
        this.accountNumber = accNum;
        accHolder = new Person(name1, name2,email, cellNum);
        this.balance = balance;
    }

    public void readDetails(){																					//Method to get all the information of person from the user
        System.out.print("Enter Account Number: ");																//Asking account number
        accountNumber = BankTest.keys.nextInt();	
        System.out.print("Enter first name: "+BankTest.keys.nextLine());										//asking first name
        String name1 = BankTest.keys.nextLine();
        System.out.print("Enter last name: ");																	//asking last name
        String name2 = BankTest.keys.nextLine();
        System.out.print("Enter email: ");																		//asking email id
        String email = BankTest.keys.nextLine();
        System.out.print("Enter phone number: ");																//asking phone number
        long phone = BankTest.keys.nextLong();
        accHolder = new Person(name1, name2, email, phone);														//reference variable that store variable of a person in Person class
        System.out.print("Enter balance: ");																	//asking balance in account
        balance = BankTest.keys.nextDouble();
    }

    public void printDetails() {																				//Method for printing 
        System.out.printf("%10d |%20s |%20s |%20d |%20.2f | %n",accountNumber,accHolder.getName(),accHolder.getEmailId(),accHolder.getPhoneNumber(),balance);
    }

    /**
     * @category: Abstract method
     */
    public abstract void updateAccBalance();																	//abstract constructor
}
