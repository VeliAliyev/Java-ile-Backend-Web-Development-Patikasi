public abstract class NormalLocation extends Location{

      NormalLocation(Player player, String name) {
            super(player, name);
      }

      abstract boolean onLocation();

}
