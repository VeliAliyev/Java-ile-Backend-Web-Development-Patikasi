import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 1; i <= 10000; i++) arr.add(i);

        NumberPool n1 = new NumberPool(arr.subList(0,2500));
        NumberPool n2 = new NumberPool(arr.subList(2500,5000));
        NumberPool n3 = new NumberPool(arr.subList(5000,7500));
        NumberPool n4 = new NumberPool(arr.subList(7500,10000));


        Thread t1 = new Thread(n1);
        Thread t2 = new Thread(n2);
        Thread t3 = new Thread(n3);
        Thread t4 = new Thread(n4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            System.out.println(Numbers.even.size());
            System.out.println(Numbers.odd.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
