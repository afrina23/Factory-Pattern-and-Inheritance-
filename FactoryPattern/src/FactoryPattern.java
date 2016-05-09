import java.util.Scanner;

/**
 * Created by Admin_8_1 on 08-May-16.
 */
public class FactoryPattern {
    public static void main(String[] args) {
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip Ship;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the type of enemy ship (U/R/B)");
        String Type=input.nextLine();
        Ship=shipFactory.EnemyShipBuild(Type);
        if(Ship!=null){
            DoStuff(Ship);
        }
        else System.out.print("Please enter U, R, or B next time");
    }



    public static void DoStuff(EnemyShip ship){
        ship.displayEnemyShip();
        ship.followHeroShip();
        ship.enemyShipShoots();

    }
}
