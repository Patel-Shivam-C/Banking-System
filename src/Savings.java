
public class Savings extends Account implements Policies{

	/**
	 * @category: Override constructor and mathematical calculation
	 */
	@Override
    public void updateAccBalance() {
		super.balance = balance +((balance*interestRate)/1200);
    }
    
	/**
	 * @category: Override constructor and print detail of detail
	 */
    @Override
    public void printDetails() {
    	System.out.printf("%10d |%20s |%20s |%20d |%20.2f | %n",accountNumber,accHolder.getName(),accHolder.getEmailId(),accHolder.getPhoneNumber(),balance);
    }
}
