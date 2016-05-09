/**
 * Created by Admin_8_1 on 10-May-16.
 */
public class Sphare extends ThreeDShape {
    Sphare(double len, double wid, double hgt) {
        super(len, wid, hgt);
    }
    public double area(){
        double a=getLenth();
        double b=getWidth();
        double c=getHight();
        return a*b+b*c+c*a;
    }
    public double volume(){
        double a=getLenth();
        double b=getWidth();
        double c=getHight();
        return a*b*c;
    }
}
