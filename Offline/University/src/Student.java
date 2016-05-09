/**
 * Created by Admin_8_1 on 10-May-16.
 */
public class Student extends Community {
    private String name;
    private String studentID;
    private String status;
    Student(String Name,String dept, String ins,String Status) {
        super(dept, ins);
        name=Name;
        status=Status;
    }

    @Override
    public void view() {
        System.out.println("Name: "+name);
        System.out.println("studentID "+studentID);
        System.out.println("Status "+status);
        super.view();
    }
}
