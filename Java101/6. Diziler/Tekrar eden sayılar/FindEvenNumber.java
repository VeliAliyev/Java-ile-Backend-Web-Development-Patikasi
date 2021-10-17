import java.util.Arrays;

public class FindEvenNumber {

    static boolean isThere(int[] even, int number){

        for (int i:even)
            if (i == number)
                return true;

        return false;
    }

    public static void main(String[] args) {

        int [] arr = {55,78,3,22,15,63,48,64,99,102,22,48,64,15};
        int [] even = new int [10];
        int index = 0;
        for(int i = 0; i < arr.length; i++)
            for (int j = 0; j <arr.length; j++){

                if(i != j && arr[j]%2 == 0 && arr[i] == arr[j]){
                    if(!isThere(even, arr[j]))
                        even[index++] = arr[j];
                }

            }
        System.out.println("Tekrar eden çift sayılar: ");
        for(int i: even)
            if(i != 0)
                System.out.println(i);
    }
}
