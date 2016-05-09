/**
 * Created by Admin_8_1 on 10-May-16.
 */
public abstract class Shape {
    private double lenth;
    private double width;
    Shape(double len,double wid){
        lenth=len;
        width=wid;
    }

    public double getLenth() {
        return lenth;
    }

    public double getWidth() {
        return width;
    }


    public abstract double area();
}
