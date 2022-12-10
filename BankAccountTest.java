public class BankAccountTest {
    public static void main(String[] args){
    BankAccount account1 = new BankAccount();
    account1.setDepositChecking(100.00);
    account1.setDepositSavings(200.00);
    account1.setWithdrawlChecking(50.00);
    account1.setWithdrawlSavings(50.00);
    System.out.println("Total Money in bank: " + BankAccount.getTotalMoney());
    System.out.println("Total Money in account: " + account1.getAllAccounts());
    }
}
