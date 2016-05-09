/**
 * Created by Admin_8_1 on 10-May-16.
 */
public class Administrator extends Facalty {

   private String position;
   private double  duration;


    Administrator(String Name, String Id, double Sal, double inc, String dept, String ins, int code, String desig, int year,String Position,double Duration) {
        super(Name, Id, Sal, inc, dept, ins, code, desig, year);
        position=Position;
        duration=Duration;
    }

    @Override
    public void view() {
        super.view();
        System.out.println("Position "+position+" Duration "+duration);
    }
}
