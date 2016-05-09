/**
 * Created by Admin_8_1 on 09-May-16.
 */
public class SavingAccount extends BankAccount{
    double depositAmount;
    double withdrawalAmount;
    int passbookNo;

    SavingAccount(String name, int num, String bank, double bal) {
        super(name, num, bank, bal);
    }

    public void DepositMoney(double money){
        depositAmount=money;
        double balance= getBalance()+money;
        setBalance(balance);
    }
    public void WithdrawMoney(double money){
        withdrawalAmount=money;
        double interest=money/10;
        double balance= getBalance()-money-interest;
        if(balance < 1000){
            System.out.println("Your balance is under 1000tk so 10 tk is deduced");
            balance-=10;
        }
        setBalance(balance);
    }
}
