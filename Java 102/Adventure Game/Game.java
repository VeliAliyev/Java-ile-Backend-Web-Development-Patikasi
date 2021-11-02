import java.util.*;

public class Game {
    Player player;
    Location location;
    SafeHouse safeHouse;
    Toolstore toolStore;
    Cave cave;
    Forest forest;
    River river;
    Mine mine;

    boolean init(Location location){

        if(this.location != null && this.location.getName().equals(location.getName())) {
            System.out.println("You are already in " + location.getName() + ".");
            return false;
        }

        if(location instanceof BattleLocation && ((BattleLocation)location).isVisited()){
            System.out.println("You have already been to "+ location.getName()+". Choose another location.");
            return  false;
        }

        else{
            this.location = location;
            System.out.println("=========================================================================");
            System.out.println("You are in "+ this.location.getName() +" now");
            this.location.onLocation();
            return  true;
        }
    }

    void start(){

        int selectLocation;
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("================================================================================================================================================================================");
        System.out.println("|                                                        Welcome to the Adventure Game!                                                                                        |");
        System.out.println("|                                                                                                                                                                              |");
        System.out.println("| Visit all of the locations, fight monsters and collect FOOD from CAVE, FIREWOOD from FOREST and WATER from RIVER to win! Once you collected all the items the game will end! |");
        System.out.println("| You should also visit MINE to get a chance of wining a WEAPON, ARMOR or MONEY by defeating SNAKES!!!                                                                         |");
        System.out.println("| You cannot return to CAVE, FOREST and RIVER if you collected items from those locations. But you can visit MINE as many times as you want!                                   |");
        System.out.println("================================================================================================================================================================================");
        System.out.println();
        System.out.println("You have to choose one of the characters : ");

        this.player = new Player();
        player.selectChar();

        safeHouse = new SafeHouse(player);
        toolStore = new Toolstore(player);
        cave = new Cave(new Zombie(), player);
        forest = new Forest(new Vampire(), player);
        river = new River(new Bear(), player);
        mine = new Mine(new Snake(0), player);

        System.out.println("Locations : ");
        System.out.println("1. Safe House");
        System.out.println("2. Tool Store");
        System.out.println("3. Cave");
        System.out.println("4. Forest");
        System.out.println("5. River");
        System.out.println("6. Mine");
        System.out.println("Enter 0 to exit game");

        while(true){

            System.out.print("Choose a location to go : ");
            selectLocation = input.nextInt();

//--------------------------------------EXIT GAME-------------------------------------------------------//
            if(selectLocation == 0){
                System.out.println("Goodbye!");
                break;
            }
//--------------------------------------SAFE HOUSE-------------------------------------------------------//
            else if(selectLocation == 1){
                if(!init(this.safeHouse))
                    continue;
            }

//--------------------------------------TOOL STORE-------------------------------------------------------//
            else if(selectLocation == 2) {
                if(!init(this.toolStore))
                    continue;
            }
//--------------------------------------CAVE-------------------------------------------------------//
            else if(selectLocation == 3) {
                if(!init(this.cave))
                    continue;
            }
//--------------------------------------FOREST-------------------------------------------------------//
            else if(selectLocation == 4) {
                if(!init(this.forest))
                    continue;
            }
//--------------------------------------RIVER-------------------------------------------------------//
            else if(selectLocation == 5) {
                if(!init(this.river))
                    continue;
            }
//--------------------------------------MINE-------------------------------------------------------//
            else if(selectLocation == 6) {
                if(!init(this.mine))
                    continue;
            }
//-------------------------------------------------------------------------------------------------//
            else {
                System.out.println("Invalid location. Try again.");
                continue;
            }

//--------------------------------------WIN OR LOSS-------------------------------------------------------//
            if(this.player.getHealth() <= 0){
                System.out.println("GAME OVER!");
                break;
            }

            else if(this.player.isWin()){
                System.out.println("Congratulations you collected all the items. Good Game!");
                break;
            }

        }
    }
}
