
public abstract class Location {

    private Player player;
    private String name;



    Location(Player player, String name){
        this.player = player;
        this.name = name;
    }



    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player getPlayer() {
        return player;
    }

    public String getName() {
        return name;
    }

    abstract boolean onLocation();
}
