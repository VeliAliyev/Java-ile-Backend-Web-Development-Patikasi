public class Asal {
    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++)
        {
            for(int j = 2; j <= i; j++)
            {
                if(i == 2)
                {
                    System.out.print(i + " ");
                    break;
                }
                else if( i%j == 0)
                    break;

                else if (j == i-1){
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
}
