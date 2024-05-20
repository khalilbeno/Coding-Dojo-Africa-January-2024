public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        totalMoney = checkingBalance + savingsBalance;
        accounts++;

    }

    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings
    // account
    public void depositToCheckAcc(double amount) {
        this.checkingBalance += amount;
        totalMoney += amount;
        System.out.println("Your deposit to Check Account is done");
    }

    public void depositTosaveAcc(double amount) {
        this.savingsBalance += amount;
        totalMoney += amount;
        System.out.println("Your deposit to save Account is done");
    }

    // withdraw
    // - users should be able to withdraw money from their checking or savings
    // account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public void withdrawFromCheck(double amount) {
        if (this.checkingBalance - amount >= 0) {
            this.checkingBalance -= amount;
            totalMoney -= amount;
            System.out.println("Withdrawal is done");
        } else {
            System.out.println("You can't ,you dont have enough money");
        }
    }

    public void withdrawFromSavings(double amount) {
        if (this.savingsBalance - amount >= 0) {
            this.savingsBalance -= amount;
            totalMoney = totalMoney - amount;
            System.out.println("Withdrawal is done");
        } else {
            System.out.println("You can't ,you dont have enough money");
        }
    }

    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public void getBalance() {
        System.out.printf("Checking Balance is: %s %n", this.checkingBalance);
        System.out.printf("Savings Balance is : %s %n", this.savingsBalance);
        System.out.printf("Total Balance is : %s %n", totalMoney);
    }
}
