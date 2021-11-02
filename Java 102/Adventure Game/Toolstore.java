import java.util.Scanner;

public class Toolstore extends NormalLocation {

    Toolstore(Player player){
        super(player,"Tool Store");
    }

    boolean onLocation(){

        menu();
        buy();

        return true;
    }

    void menu(){
        System.out.println("Welcome to Tool Store. Here is the Item List: ");
        System.out.println();

        System.out.println("WEAPONS: ");
        System.out.println("=================================================================");
        System.out.println("| GUN   =>\t|\t id : 1 \t|\t damage : 2 \t|\t price : 25 |");
        System.out.println("| SWORD =>\t|\t id : 2 \t|\t damage : 3 \t|\t price : 35 |");
        System.out.println("| RIFLE =>\t|\t id : 3 \t|\t damage : 7 \t|\t price : 45 |");
        System.out.println("=================================================================");

        System.out.println();

        System.out.println("ARMOURS: ");
        System.out.println("=========================================================================");
        System.out.println("| LIGHT  ARMOR  =>\t|\t id : 1 \t|\t defense : 1 \t|\t price : 15 |");
        System.out.println("| MEDIUM ARMOR  =>\t|\t id : 2 \t|\t defense : 3 \t|\t price : 25 |");
        System.out.println("| HEAVY  ARMOR  =>\t|\t id : 3 \t|\t defense : 5 \t|\t price : 40 |");
        System.out.println("=========================================================================");
        System.out.println();

        System.out.println("=====================");
        System.out.println("| YOUR BALANCE : " + this.getPlayer().getMoney() + " |");
        System.out.println("=====================");
        System.out.println("Enter 0 to exit");
        System.out.println();
    }

    void buy(){

        int choice;
        Scanner input = new Scanner(System.in);

        while(true){

            System.out.print("Select 1 for Weapons or 2 for Armours : ");
            choice = input.nextInt();

            if(choice == 1){

                System.out.println("Enter 0 to go back");

                while(true){

                    System.out.println();
                    System.out.print("Select weapon id you want to buy : ");
                    choice = input.nextInt();

                    if(choice == 0)
                        break;

                    else if(choice == 1){
                        if(this.getPlayer().getMoney() < 25){
                            System.out.println("You don't have enough money to buy a GUN");
                            continue;
                        }
                        else{
                            this.getPlayer().getInventory().setWeaponName("GUN");
                            this.getPlayer().getInventory().setWeaponDamage(2);
                            this.getPlayer().setMoney(this.getPlayer().getMoney() - 25);
                        }
                    }

                    else if(choice == 2){
                        if(this.getPlayer().getMoney() < 35){
                            System.out.println("You don't have enough money to buy a SWORD");
                            continue;
                        }
                        else{
                            this.getPlayer().getInventory().setWeaponName("SWORD");
                            this.getPlayer().getInventory().setWeaponDamage(3);
                            this.getPlayer().setMoney(this.getPlayer().getMoney() - 35);
                        }
                    }

                    else if(choice == 3){
                        if(this.getPlayer().getMoney() < 45){
                            System.out.println("You don't have enough money to buy a RIFLE");
                            continue;
                        }
                        else{
                            this.getPlayer().getInventory().setWeaponName("RIFLE");
                            this.getPlayer().getInventory().setWeaponDamage(7);
                            this.getPlayer().setMoney(this.getPlayer().getMoney() - 45);
                        }
                    }
                    else if(choice < 0 || choice > 3){
                        System.out.print("Invalid entry. Try again.");
                        continue;
                    }

                    System.out.println("Succesfull purchase! Now you have " + this.getPlayer().getInventory().getWeaponName());
                    break;

                }

            }

            else if(choice == 2){

                System.out.println("Enter 0 to go back");

                while(true){

                    System.out.println();
                    System.out.print("Select armor id you want to buy : ");

                    choice = input.nextInt();

                    if(choice == 0)
                        break;

                    else if(choice == 1){
                        if(this.getPlayer().getMoney() < 15){
                            System.out.println("You don't have enough money to buy LIGHT ARMOR");
                            continue;
                        }
                        else{
                            this.getPlayer().getInventory().setArmorName("LIGHT ARMOR");
                            this.getPlayer().getInventory().setArmorDefense(1);
                            this.getPlayer().setMoney(this.getPlayer().getMoney() - 15);
                        }
                    }

                    else if(choice == 2){
                        if(this.getPlayer().getMoney() < 25){
                            System.out.println("You don't have enough money to buy MEDIUM ARMOR");
                            continue;
                        }
                        else{
                            this.getPlayer().getInventory().setArmorName("MEDIUM ARMOR");
                            this.getPlayer().getInventory().setArmorDefense(3);
                            this.getPlayer().setMoney(this.getPlayer().getMoney() - 25);
                        }
                    }

                    else if(choice == 3){
                        if(this.getPlayer().getMoney() < 40){
                            System.out.println("You don't have enough money to buy HEAVY ARMOR");
                            continue;
                        }
                        else{
                            this.getPlayer().getInventory().setArmorName("HEAVY ARMOR");
                            this.getPlayer().getInventory().setArmorDefense(5);
                            this.getPlayer().setMoney(this.getPlayer().getMoney() - 40);
                        }
                    }
                    else if(choice < 0 || choice > 3){
                        System.out.print("Invalid entry. Try again.");
                        continue;
                    }

                    System.out.println("Succesfull purchase! Now you have " + this.getPlayer().getInventory().getArmorName());
                    break;
                }
            }
            else if(choice == 0)
                break;

            else{
                System.out.println("Invalid Entry. Try again. ");
            }
        }
        System.out.println();
        System.out.println("=====================");
        System.out.println("| YOUR BALANCE : " + this.getPlayer().getMoney() + " |");
        System.out.println("=====================");
        System.out.println();
    }
}
