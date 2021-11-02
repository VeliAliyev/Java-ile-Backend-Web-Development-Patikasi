import java.util.Random;

public class Snake extends Obstacle{

    Random random = new Random();

    public Snake(int damage) {
        super(damage,12,0,"Snake");
        this.generateTrophy();
    }

    public void generateTrophy(){

        int chance = this.random.nextInt(101);
        int chance2 = this.random.nextInt(101);

        if(chance >= 0 && chance <= 15){

            if(chance2 > 50) this.setTrophy("GUN");
            else if(chance2 >= 21 && chance2 <=50) this.setTrophy("SWORD");
            else if(chance2 >=0 && chance2 <=20) this.setTrophy("RIFLE");
        }
        else if(chance >=16 && chance <=30){

            if(chance2 > 50) this.setTrophy("LIGHT ARMOR");
            else if(chance2 >= 21 && chance2 <=50) this.setTrophy("MEDIUM ARMOR");
            else if(chance2 >=0 && chance2 <=20) this.setTrophy("HEAVY ARMOR");
        }
        else if(chance >=31 && chance <=55){

            this.setTrophy("MONEY");
            if(chance2 > 50) this.setMoney(1);
            else if(chance2 >= 21 && chance2 <=50) this.setMoney(5);
            else if(chance2 >=0 && chance2 <=20) this.setMoney(10);
        }
    }
}
