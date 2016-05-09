/**
 * Created by Admin_8_1 on 10-May-16.
 */
public class Triangle extends TwoDShape {
    Triangle(double len, double wid) {
        super(len, wid);
    }
    public double area(){
        return .5*getWidth()*getLenth();
    }
}
