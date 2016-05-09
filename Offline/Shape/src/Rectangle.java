/**
 * Created by Admin_8_1 on 10-May-16.
 */
public class Rectangle  extends TwoDShape{
    Rectangle(double len, double wid) {
        super(len, wid);
    }
    public double area(){
        return getWidth()*getLenth();
    }
}
