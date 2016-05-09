/**
 * Created by Admin_8_1 on 10-May-16.
 */
public class Alumny extends Community {
    private String name;
    private int passYear;
    Alumny(String Name,String dept, String ins,int year) {
        super(dept, ins);
        name=Name;
        passYear=year;
    }

    @Override
    public void view() {
        System.out.println("Name: "+name);
        System.out.println("passyear "+passYear);
        super.view();
    }
}
