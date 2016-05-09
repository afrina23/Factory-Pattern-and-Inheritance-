/**
 * Created by Admin_8_1 on 09-May-16.
 */
public class BasicAccount extends BankAccount {
    double checkAmount;
    int countChecks;
    int checkbookNo;

    BasicAccount(String name, int num, String bank, double bal) {
        super(name, num, bank, bal);
        countChecks=0;
        checkbookNo=8;
    }

    public void Check(int money){
        checkAmount=money;
        countChecks++;
        if(countChecks>checkbookNo){
            System.out.println("You have already used you allocated checkbooks");
            double charge=100;
            if(money+100 <getBalance())setBalance(getBalance()-money-100);
            else System.out.println("you don't have enough money");
        }
        else{
            if(money<getBalance()) setBalance(getBalance()-money);
            else System.out.println("you don't have enough money");
        }
    }
}
