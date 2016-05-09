/**
 * Created by Admin_8_1 on 09-May-16.
 */
public class DepositAccount extends BankAccount{
    double depositAmount;
    int countChecks;

    DepositAccount(String name, int num, String bank, double bal) {
        super(name, num, bank, bal);
        countChecks=0;
        if( bal > 1000){
            bal+=bal/100;
            setBalance(bal);
        }
    }
    void Check(double money){
        if(countChecks>=3){
            System.out.println("You have exceeded your chech amount level");
        }
        else{
            if(money<getBalance()) setBalance(getBalance()-money);
            else System.out.println("You dont have enough money");
        }
        if(getBalance()<1000){
            setBalance(getBalance()-10);
        }
    }


}
