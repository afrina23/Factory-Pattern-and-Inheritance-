/**
 * Created by Admin_8_1 on 10-May-16.
 */
public class Employee extends Community {
    private String name;
    private String employeeID;
    private double salary;
    private double increment;
    Employee(String Name,String Id,double Sal,double inc,String dept, String ins) {
        super(dept, ins);
        name=Name;
        employeeID=Id;
        salary=Sal;
        increment=inc;
    }

    @Override
    public void view() {
        System.out.println("Name "+name);
        System.out.println("employeeID "+employeeID);
        System.out.println("salary "+salary);
        System.out.println("increment "+increment);
        super.view();
    }
}
