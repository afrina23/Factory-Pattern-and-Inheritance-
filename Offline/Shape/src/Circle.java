/**
 * Created by Admin_8_1 on 10-May-16.
 */
public class Circle extends TwoDShape{
    Circle(double len) {
        super(len,len);
    }

    public double area(){
        double rad=getLenth();
        return  (Math.PI*rad*rad);
    }
}
