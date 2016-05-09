/**
 * Created by Admin_8_1 on 09-May-16.
 */
public class BankAccount  extends Account{
    private  String bankName;
    private double balance;
    BankAccount(String name, int num,String bank,double bal){
        bankName=bank;
        balance=bal;
        setHolderName(name);
        setAccountNum(num);
        setHolderType("User");
    }

    public void setBalance(double bal) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getBankName() {
        return bankName;
    }
}
