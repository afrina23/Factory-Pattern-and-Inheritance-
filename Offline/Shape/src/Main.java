/**
 * Created by Admin_8_1 on 10-May-16.
 */
public class Main {
    public static void main(String[] args) {
        Circle c= new Circle(20);
        Rectangle r=new Rectangle(10,20);
        Cube cu=new Cube(10);
        Sphare s= new Sphare(2,3,4);
        Triangle t= new Triangle(1,2);
        System.out.println(c.area());
    }
}
