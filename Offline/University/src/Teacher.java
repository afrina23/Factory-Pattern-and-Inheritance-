/**
 * Created by Admin_8_1 on 10-May-16.
 */
public class Teacher extends Facalty {
     private int noCourses;
     private double weeklyHour;
    Teacher(String Name, String Id, double Sal, double inc, String dept, String ins, int code, String desig, int year,int Courses,double hour) {
        super(Name, Id, Sal, inc, dept, ins, code, desig, year);
        noCourses=Courses;
        weeklyHour=hour;
    }

    @Override
    public void view() {
        super.view();
        System.out.println(" noCourses "+noCourses + " weeklyHour "+weeklyHour);
    }
}
