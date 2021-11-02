
public class Obstacle {

    private String trophy;
    private int number;
    private int damage;
    private int health;
    private int money;
    private String type;

    Obstacle(int damagae, int health, int money, String type){

        this.damage = damagae;
        this.health = health;
        this.money = money;
        this.type = type;
        this.trophy = "MONEY";
    }

    public int getNumber() {
        return number;
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

    public String getType() {
        return type;
    }

    public String getTrophy() {
        return trophy;
    }

    public void setTrophy(String trophy) {
        this.trophy = trophy;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public void setType(String type) {
        this.type = type;
    }
}
