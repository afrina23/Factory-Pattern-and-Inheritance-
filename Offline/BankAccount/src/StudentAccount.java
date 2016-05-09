/**
 * Created by Admin_8_1 on 09-May-16.
 */
public class StudentAccount extends Account{
    private String institute;
    private String status;
    StudentAccount(String name, int num,String school,String Status){
        setHolderName(name);
        setAccountNum(num);
        setHolderType("Student");
        institute=school;
        status=Status;
    }
}
