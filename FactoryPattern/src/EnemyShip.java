/**
 * Created by Admin_8_1 on 08-May-16.
 */
public abstract class EnemyShip {
    private String name;
    private double amtDamage;
    public void setName(String iName){
        name=iName;
    }
    public  void setAmtDamage(double damage){
        amtDamage=damage;
    }
    public String getName(){
        return  name;
    }
    public double getAmtDamage(){
        return amtDamage;
    }
    public void followHeroShip(){

        System.out.println(getName() + " is following the hero");

    }

    public void displayEnemyShip(){
                System.out.println(getName() + " is on the screen");

    }

    public void enemyShipShoots() {
        System.out.println(getName() + " attacks and does " + getAmtDamage() + " damage to hero");
    }

}
