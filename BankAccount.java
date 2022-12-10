public class BankAccount {
    private double checkingBalance=0.0;
    private double savingsBalance=0.0;
    private static int totalAccounts = 0;
    private static double totalMoney = 0.0;

    public BankAccount(){
        totalAccounts++;
        // System.out.println("Total # of account: " + totalAccounts);
        // if(checkingBalance > 0.00 && savingsBalance > 0.0){
            totalMoney += checkingBalance ;
            totalMoney += savingsBalance ;
        // }
        System.out.println("Total Money in all accounts: " + totalMoney);
    }

    // getters
    public double getChecking(){
        return checkingBalance;
    };
    public double getSavings(){
        return savingsBalance;
    };
    public double getAllAccounts(){
        double all = checkingBalance + savingsBalance;
        return all;
    };
    public static double getTotalMoney(){
        // double totalMoney = checkingBalance + savingsBalance;
        return totalMoney;
    };
    // setters
    // deposit
    public void setDepositChecking(double spend){
        // System.out.println("before deposit: " + checkingBalance);
        this.checkingBalance += spend;
        totalMoney += checkingBalance;
        // System.out.println("after deposit: " + checkingBalance);
    };
    public void setDepositSavings(double save){
        this.savingsBalance += save;
        totalMoney += savingsBalance;
    };
    // withdrawl
    public void setWithdrawlChecking(double spend){
        if(checkingBalance < 0.00 || checkingBalance < spend){
            System.out.println("Out of money");
        }
        else{
            this.checkingBalance -= spend;
            totalMoney -= spend;
        }
    };
    public void setWithdrawlSavings(double save){
        if(savingsBalance < 0.00 || savingsBalance < save){
            System.out.println("Out of money");
        }
        else{
            this.savingsBalance -= save;
            totalMoney -= save;
        }

    };


    
}
