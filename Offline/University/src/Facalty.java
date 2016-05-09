/**
 * Created by Admin_8_1 on 10-May-16.
 */
public class Facalty extends Employee {
    int facultyCode;
    String designation;
    int joinYear;
    Facalty(String Name, String Id, double Sal, double inc, String dept, String ins,int code,String desig,int year) {
        super(Name, Id, Sal, inc, dept, ins);
        facultyCode=code;
        designation=desig;
        joinYear=year;
    }



    @Override
    public void view() {

        super.view();
        System.out.println("facultyCode "+facultyCode+" designation "+ designation+" joinYear "+ joinYear);
    }
}
