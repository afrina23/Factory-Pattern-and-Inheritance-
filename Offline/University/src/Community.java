/**
 * Created by Admin_8_1 on 10-May-16.
 */
public class Community {
    private String department;
    private String institute;

    Community(String dept ,String ins){
        department=dept;
        institute=ins;
    }
    public void view(){
        System.out.println("Depertment "+department);
        System.out.println("Institute "+institute);
    }
}
