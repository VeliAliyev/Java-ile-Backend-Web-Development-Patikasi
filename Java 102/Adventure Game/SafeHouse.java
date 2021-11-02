public class SafeHouse extends NormalLocation{

    SafeHouse(Player player){
        super(player,"Safe House");
    }

    boolean onLocation(){

        if(this.getPlayer().getName().equals("SAMURAI"))
            this.getPlayer().setHealth(21);

        else if(this.getPlayer().getName().equals("ARCHER"))
            this.getPlayer().setHealth(18);

        else if(this.getPlayer().getName().equals("KNIGHT"))
            this.getPlayer().setHealth(24);

        System.out.println("Your health is maximum now : " + this.getPlayer().getHealth());
        return true;
    };

}
