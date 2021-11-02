import java.util.*;

public abstract class BattleLocation extends Location{

    Obstacle obstacle;
    String trophy;
    String choice;
    boolean isVisited = false;
    Random random = new Random();
    Scanner input = new Scanner(System.in);

    BattleLocation(Obstacle o, Player player, String name, String trophy){
        super(player,name);
        this.obstacle = o;
        this.trophy = trophy;
    }

    boolean onLocation(){
        this.obstacle.setNumber(this.random.nextInt(3) + 1);
        if(this.obstacle instanceof Snake)
            this.obstacle.setDamage(this.random.nextInt(4) + 3);
        combat();
        return true;
    }

    public boolean isVisited() {
        return isVisited;
    }

    void attack(int number){

        int actualDamage;
        System.out.println("=========================================================================");
//---------------------------------------------------CHARACTER--------------------------------------------------------//
        if(number == 1){
            //player attacks monster
            System.out.println("*** " + this.getPlayer().getName() + " is attacking the " + this.obstacle.getType() + " ***");

            //print monster's health and player's damage. If player has any weapon then print its damage too
            System.out.println(this.obstacle.getType()+"'s health ==> |\t" + this.obstacle.getHealth() + "\t|");
            System.out.println();
            System.out.print(this.getPlayer().getName() + "'S damage ==> |\t" + this.getPlayer().getDamage() + "\t|");

            if(this.getPlayer().getInventory().getWeaponDamage() > 0)
                System.out.print(" + " + this.getPlayer().getInventory().getWeaponDamage() + " damage from "
                                         + this.getPlayer().getInventory().getWeaponName());

            //Calculate damage. If damage is bigger than monster's health then set monster's health to 0
            actualDamage = this.getPlayer().getDamage() + this.getPlayer().getInventory().getWeaponDamage();
            if(actualDamage > this.obstacle.getHealth())
                this.obstacle.setHealth(0);

            else
                this.obstacle.setHealth(this.obstacle.getHealth() - actualDamage);

            //print monster's health
            System.out.println("\n" + this.obstacle.getType() + "'s health ==> |\t" + this.obstacle.getHealth() + "\t|");

        }
//------------------------------------------MONSTER-------------------------------------------------------------------//
        else if(number == 0){

            //monster attacks player
            System.out.println("!!! " + this.obstacle.getType() + " is attacking the " + this.getPlayer().getName() + " !!!");

            //print player's health. If he/she has an armor then print its defense.
            System.out.println(this.getPlayer().getName() + "'S health ==> |\t" + this.getPlayer().getHealth() + "\t|");

            if(this.getPlayer().getInventory().getArmorDefense() > 0){

                System.out.println(this.getPlayer().getName() + "'S defense ==> |\t" +
                                   this.getPlayer().getInventory().getArmorDefense()+"\t|" +" from " +
                                   this.getPlayer().getInventory().getArmorName());
            }

            //print monster's damage
            System.out.println();
            System.out.println(this.obstacle.getType() + "'s damage ==> |\t" + this.obstacle.getDamage() + "\t|");

            //Calculate damage. If monster's damage is less than armor's defense then damage is 0
            if(this.getPlayer().getInventory().getArmorDefense() > this.obstacle.getDamage())
                actualDamage = 0;
            else
                actualDamage = this.obstacle.getDamage() - this.getPlayer().getInventory().getArmorDefense();

            //update player's health
            this.getPlayer().setHealth(this.getPlayer().getHealth() - actualDamage);

            //print player's health. If it is less than 0 then set it to 0;
            if(this.getPlayer().getHealth() < 0)
                this.getPlayer().setHealth(0);

            System.out.println(this.getPlayer().getName() + "'S health ==> |\t" + this.getPlayer().getHealth() + "\t|");
        }
        System.out.println();
    }

    void spawn(){

        if(this.obstacle instanceof Zombie){
            this.obstacle.setHealth(10);
        }

        else if(this.obstacle instanceof Snake){
            this.obstacle.setHealth(12);
            ((Snake) this.obstacle).generateTrophy();
        }

        else if(this.obstacle instanceof Vampire){
            this.obstacle.setHealth(14);
        }

        else if(this.obstacle instanceof Bear){
            this.obstacle.setHealth(20);
        }
    }

    void updateInventory(){

        if(this.trophy.equals("FOOD")){
            this.getPlayer().getInventory().setFood(true);
        }

        else if(this.trophy.equals("FIREWOOD")){
            this.getPlayer().getInventory().setFirewood(true);
        }

        else if(this.trophy.equals("WATER")){
            this.getPlayer().getInventory().setWater(true);
        }
    }

    void loot(){

        if(this.obstacle.getTrophy().equals("MONEY")){

            this.getPlayer().setMoney(this.getPlayer().getMoney() + this.obstacle.getMoney());
            System.out.println();
            System.out.println("You loot : " + this.obstacle.getMoney() +  " money from the " + this.obstacle.getType());
            System.out.println("Your balance now is : " + this.getPlayer().getMoney());
            System.out.println();
        }
        else{
            System.out.println();
            System.out.println("You loot a " + this.obstacle.getTrophy());
            System.out.print("Will you take it? YES/NO? [y/n] : ");
            this.choice = this.input.next();

            if(this.choice.equals("y")){

                if(this.obstacle.getTrophy().equals("GUN")){
                    this.getPlayer().getInventory().setWeaponName("GUN");
                    this.getPlayer().getInventory().setWeaponDamage(2);
                }
                else if(this.obstacle.getTrophy().equals("SWORD")){
                    this.getPlayer().getInventory().setWeaponName("SWORD");
                    this.getPlayer().getInventory().setWeaponDamage(3);
                }
                else if(this.obstacle.getTrophy().equals("RIFLE")){
                    this.getPlayer().getInventory().setWeaponName("RIFLE");
                    this.getPlayer().getInventory().setWeaponDamage(7);
                }

                if(this.obstacle.getTrophy().equals("LIGHT ARMOR")){
                    this.getPlayer().getInventory().setArmorName("LIGHT ARMOR");
                    this.getPlayer().getInventory().setArmorDefense(1);
                }
                else if(this.obstacle.getTrophy().equals("MEDIUM ARMOR")){
                    this.getPlayer().getInventory().setArmorName("MEDIUM ARMOR");
                    this.getPlayer().getInventory().setArmorDefense(3);
                }
                else if(this.obstacle.getTrophy().equals("HEAVY ARMOR")){
                    this.getPlayer().getInventory().setArmorName("HEAVY ARMOR");
                    this.getPlayer().getInventory().setArmorDefense(5);
                }
            }
            System.out.println();
        }
    }

    void checkWin(){
        if(this.getPlayer().getInventory().isFirewood() && this.getPlayer().getInventory().isFood() && this.getPlayer().getInventory().isWater()){

            this.getPlayer().setWin(true);

            if(!this.trophy.equals("NONE"))
                System.out.println("Congratulations! You collected " + this.trophy);
        }
        else{
            if(!(this instanceof Mine))
                this.isVisited = true;

            if(!this.trophy.equals("NONE"))
                System.out.println("Congratulations! You collected " + this.trophy);
            System.out.println("Visit other locations and collect all the items to win this game");

        }
    }

    void combat(){

        System.out.println("There are " + this.obstacle.getNumber() + " " + this.obstacle.getType() + "(s) in this " + this.getName());

//------------------------------------------------COMBAT--------------------------------------------------------------//
        do{
            System.out.println("Press F/f to fight or press L/l to leave the combat");
            this.choice = this.input.next();

            if(this.choice.equalsIgnoreCase("l")){
                this.spawn();
                System.out.println("You left the combat");
                break;
            }
            else if(this.choice.equalsIgnoreCase("f")){
                this.attack(this.random.nextInt(2));
                System.out.println();
            }

            if(this.obstacle.getHealth() <= 0){

                System.out.println("You defeated a " + this.obstacle.getType());
                this.obstacle.setNumber(this.obstacle.getNumber() - 1);
                System.out.println("There are " + this.obstacle.getNumber() + " " + this.obstacle.getType() + "(s) left.");
                this.loot();
                this.spawn();
            }

        }while(this.getPlayer().getHealth() > 0 && this.obstacle.getNumber() > 0);

//--------------------------------------CHECK IF WON-------------------------------------------------------//
        if(this.getPlayer().getHealth() > 0 && !this.choice.equalsIgnoreCase("l")){

            this.updateInventory();
            this.checkWin();
        }
    }
}
