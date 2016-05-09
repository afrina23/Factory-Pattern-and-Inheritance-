/**
 * Created by Admin_8_1 on 09-May-16.
 */
public class EnemyShipFactory {
    public EnemyShip EnemyShipBuild(String name){
        if(name.equals("U")) return new UfoEnemyShip();
        else if (name.equals("R")) return new RocketEnemyShip();
        else if (name.equals("B"))return new BigUfoEnemyShip();
        else return null;
    }
}
