public class Inventory {
    private boolean food;
    private boolean water;
    private boolean firewood;
    private String weaponName;
    private String armorName;
    private int weaponDamage;
    private int armorDefense;

    Inventory(){

        food = false;
        water = false;
        firewood = false;
        weaponDamage = 0;
        armorDefense = 0;

    }

    public boolean isFood() {
        return food;
    }

    public boolean isWater() {
        return water;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public String getArmorName() {
        return armorName;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public int getArmorDefense() {
        return armorDefense;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public void setArmorDefense(int armorDefense) {
        this.armorDefense = armorDefense;
    }
}
