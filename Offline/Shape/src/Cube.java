/**
 * Created by Admin_8_1 on 10-May-16.
 */
public class Cube extends ThreeDShape {
    Cube(double len) {
        super(len, len, len);
    }
    public double area(){
        double a=getLenth();
        return 6*a*a;
    }
    public double volume(){
        double a=getLenth();
        return a*a*a;
    }
}
