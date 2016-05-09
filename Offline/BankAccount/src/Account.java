/**
 * Created by Admin_8_1 on 09-May-16.
 */
public abstract class Account {
    private int accountNum;
    private String holderName;
    private String holderType;
    public void setAccountNum(int num){
        accountNum=num;
    }
    public void setHolderName(String name){
        holderName=name;
    }
    public void setHolderType(String Type){
        holderType=Type;

    }
    public int getAccountNum(){
        return accountNum;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getHolderType() {
        return holderType;
    }
}
