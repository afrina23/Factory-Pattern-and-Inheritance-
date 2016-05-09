/**
 * Created by Admin_8_1 on 10-May-16.
 */
public class Stuff extends Employee {
    private int joinYear;
    private int duration;
    Stuff(String Name, String Id, double Sal, double inc, String dept, String ins,int year,int dur) {
        super(Name, Id, Sal, inc, dept, ins);
        joinYear=year;
        duration=dur;
    }



    @Override
    public void view() {
        super.view();
        System.out.println("Joinyear "+joinYear+" duration "+duration);
    }
}
