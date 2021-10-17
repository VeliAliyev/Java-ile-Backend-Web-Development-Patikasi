public class Frequency {

    static boolean isThere(int [] arr, int number){

        for(int i : arr)
            if(i == number)
                return true;
        return false;
    }

    public static void main(String[] args) {

        int [] arr = {10, 20, 20, 10, 10, 20, 5, 20, 5, 6, 10, 20, 6};
        int [] duplicate = new int [arr.length];
        int counter = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){

                if(arr[i] == arr[j]){
                    if(!isThere(duplicate,arr[i]))
                        duplicate[i] = arr[i];
                    counter++;
                }
            }
            if(duplicate[i] != 0)
                System.out.println(duplicate[i] + " sayısı " + counter + " kere tekrar edildi.");
                /*10 sayısı 4 kere tekrar edildi.
                  20 sayısı 5 kere tekrar edildi.
                  5 sayısı 2 kere tekrar edildi.
                  6 sayısı 2 kere tekrar edildi.*/
            counter = 0;
        }
    }
}
