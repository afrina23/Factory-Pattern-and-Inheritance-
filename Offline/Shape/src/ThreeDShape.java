/**
 * Created by Admin_8_1 on 10-May-16.
 */
public class ThreeDShape extends Shape {
    private double hight;
    ThreeDShape(double len, double wid,double hgt) {
        super(len, wid);
        hight=hgt;
    }

    public double getHight() {
        return hight;
    }

    @Override
    public double area() {
        return 0;
    }
    public double volume(){
        return 0;
    }
}
