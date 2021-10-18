public class ArrayB {
    public static void main(String[] args) {

        String[][] str = new String[7][4];

        for(int i = 0; i < str.length; i++)
            for (int j = 0; j < str[i].length; j++)
            {
                if(i == 0 || i == 3 || i == 6)
                    str[i][j] = " * ";
                else  if(j == 0 || j == 3)
                    str[i][j] = " * ";
                else
                    str[i][j] = "   ";
            }
        for(String[] i : str) {
            for (String j : i)
                System.out.print(j);
            System.out.println();

        }
    }
}
