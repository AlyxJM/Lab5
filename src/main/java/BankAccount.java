/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    /**
     * Account number.
     */
    private int accountNumber;
    /**
     * Account Type - Checking, Savings, Student, or Workplace.
     */
    private BankAccountType accountType;
    /**
     * Amount of money in account.
     */
    private double accountBalance;
    /**
     * Name of the account holder.
     */
    private String ownerName;
    /**
     * Interest Rate.
     */
    private double interestRate;
    /**
     * Interest Earned.
     */
    private double interestEarned;
    /**
     * Random multiplier.
     */
    private static final int MULTIPLIER = 100;

    /**
     * Creates a Bank Account.
     * @param name  Name of account holder
     * @param accountCategory Type of account
     */
    BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        this.setAccountNumber((int) Math.random() * MULTIPLIER);
        this.setAccountBalance((int) Math.random() * MULTIPLIER);
        this.setOwnerName(name);
        this.setAccountType(accountCategory);
        this.setInterestEarned((int) Math.random() * MULTIPLIER);
        this.setInterestRate((int) Math.random() * MULTIPLIER);
        Bank.incrementTotalAccounts();
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     * Gets Account Number.
     * @return Account Number
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**
     * Sets Account Number
     * @param accountNumber Number to set account number
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Gets Account Type (checking, savings, etc).
     * @return Account Type
     */
    public BankAccountType getAccountType() {
        return accountType;
    }
    /**
     * Sets Account
     * @param accountType Type from specified options
     */
    public void setAccountType(BankAccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * Gets current Account Balance.
     * @return Account Balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     * Sets Account Balance
     * @param accountBalance  Number to set balance
     */
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    /**
     * Gets name of the account owner.
     * @return Name of account owner
     */
    public String getOwnerName() {
        return ownerName;
    }
    /**
     * Set Owner Name.
     * @param ownerName Name to set as account owner.
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    /**
     * Get Interest Rate.
     * @return Interest Rate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Set Interest Rate.
     * @param interestRate Interest Rate
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * Get Interest Earned.
     * @return Interest Earned
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * Set Interest Earned.
     * @param interestEarned Interest Earned
     */
    public void setInterestEarned(double interestEarned) {
        this.interestEarned = interestEarned;
    }
}
