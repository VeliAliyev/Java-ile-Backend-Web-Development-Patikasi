import java.util.Scanner;

public class Player {
    private Inventory inventory;
    private int damage;
    private int health;
    private int money;
    private String name;
    private boolean win;

    void selectChar(){

        int id = 0;
        System.out.println(" =======================================================================================");
        System.out.print("| SAMURAI =>\t");
        System.out.println("|\t id : 1 \t|\t damage : 5 \t|\t health : 21 \t|\t money : 15 |");
        System.out.print("| ARCHER  =>\t");
        System.out.println("|\t id : 2 \t|\t damage : 7 \t|\t health : 18 \t|\t money : 20 |");
        System.out.print("| KNIGHT  =>\t");
        System.out.println("|\t id : 3 \t|\t damage : 8 \t|\t health : 24 \t|\t money : 5  |");
        System.out.println(" =======================================================================================");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter character id : ");

        while(true){

            id = input.nextInt();
            if(id == 1) {
                setName("SAMURAI");
                setDamage(5);
                setHealth(21);
                setMoney(15);
                break;
            }
            else if(id == 2) {
                setName("ARCHER");
                setDamage(7);
                setHealth(18);
                setMoney(20);
                break;
            }
            else if(id == 3) {
                setName("KNIGHT");
                setDamage(8);
                setHealth(24);
                setMoney(5);
                break;
            }
            else System.out.println("Wrong ID. Try again : ");
        }

        this.inventory = new Inventory();

        System.out.println("You chose " + this.name + ". Good Luck!");
        System.out.println();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public boolean isWin() { return win; }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setWin(boolean win) {
        this.win = win;
    }
}
