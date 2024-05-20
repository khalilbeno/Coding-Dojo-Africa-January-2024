public class BankTest {
    public static void main(String[] args) {
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount(500, 400);
        BankAccount account2 = new BankAccount(100, 20);
        BankAccount account3 = new BankAccount(0, 0);

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and
        // display the balance each time
        // - each deposit should increase the amount of totalMoney
        account1.depositToCheckAcc(20);
        account1.depositTosaveAcc(30);
        account2.depositToCheckAcc(40);
        account2.depositTosaveAcc(70);
        account3.depositToCheckAcc(60);
        account3.depositTosaveAcc(5);
        account1.getBalance();
        account2.getBalance();
        account3.getBalance();
        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account
        // and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        account1.withdrawFromCheck(10);
        account1.withdrawFromSavings(20);
        account1.getBalance();
        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println(BankAccount.getAccounts());
        System.out.println(BankAccount.getTotalMoney());
    }
}
