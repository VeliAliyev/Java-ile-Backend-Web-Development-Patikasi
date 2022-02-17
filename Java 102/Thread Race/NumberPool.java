import java.util.*;


public class NumberPool implements Runnable{

    private final ArrayList<Integer> numberPool;


    NumberPool(List<Integer> numberPool){
        this.numberPool = new ArrayList<>(numberPool);
    }

    @Override
    public void run() {

        for (Integer number : this.numberPool) {
            if (number % 2 == 0)
                Numbers.writeEven(number);
            else
                Numbers.writeOdd(number);
        }


    }


}
