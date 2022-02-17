import java.util.ArrayList;

public class Numbers {

    public static ArrayList<Integer> even = new ArrayList<>();
    public static ArrayList<Integer> odd = new ArrayList<>();

    public static synchronized void writeEven(Integer number){
        even.add(number);
        System.out.println(Thread.currentThread().getName() + " Even Number :" + number);
    }

    public static synchronized void writeOdd(Integer number){
        odd.add(number);
        System.out.println(Thread.currentThread().getName() + " Odd Number :" + number);
    }

}
