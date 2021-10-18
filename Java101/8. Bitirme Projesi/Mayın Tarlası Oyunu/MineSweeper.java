import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MineSweeper {

    String[][] field;
    String[][] mineField;
    ArrayList<Coordinates> coordinates;
    int mines;
    int row;
    int col;

    MineSweeper(int row, int col){
        this.field = new String[row][col];
        this.mineField = new String[row][col];
        this.row = row;
        this.col = col;
        this.coordinates = new ArrayList<Coordinates>();
        this.mines = (col*row) / 4;
    }

    void setField() {

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                this.field[i][j] = "-";
                this.mineField[i][j] = "-";

                Coordinates coordinate = new Coordinates();
                coordinate.x = i;
                coordinate.y = j;
                coordinates.add(coordinate);
            }
        }

        Collections.shuffle(coordinates);

        for(int i = 0; i < this.mines; i++){
            this.mineField[coordinates.get(i).x][coordinates.get(i).y] = "*";
        }
    }

    void printField(){

        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++){

                System.out.print(this.field[i][j]+"\t");

            }
            System.out.println();
        }
        System.out.println("===========================");
    }

    void printMineField(){

        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++){

                System.out.print(this.mineField[i][j]+"\t");

            }
            System.out.println();
        }
        System.out.println("===========================");

    }

    boolean check(int x, int y){

        int counter = 0;

        if(this.mineField[x][y].equals("*"))
            return false;
        else {
            if(x != 0 && this.mineField[x-1][y].equals("*"))
                counter++;

            if(x != row - 1 && this.mineField[x+1][y].equals("*"))
                counter++;

            if(y != 0 && this.mineField[x][y-1].equals("*"))
                counter++;

            if(y != col - 1 && this.mineField[x][y+1].equals("*"))
                counter++;

            if(x != 0 && y !=0 && this.mineField[x-1][y-1].equals("*"))
                counter++;

            if(x != 0 && y != col - 1 && this.mineField[x-1][y+1].equals("*"))
                counter++;

            if(x != row - 1 && y != 0 && this.mineField[x+1][y-1].equals("*"))
                counter++;

            if(x != row - 1 && y != col - 1 && this.mineField[x+1][y+1].equals("*"))
                counter++;

            this.mineField[x][y] = String.valueOf(counter);
            this.field[x][y] = String.valueOf(counter);
            return true;
        }
    }

    void run(){

        int x,y,counter = 0;
        this.setField();
        this.printMineField();


        this.printField();
        Scanner scan = new Scanner(System.in);
        while(true) {

            System.out.print("Satır Giriniz : ");
            x = scan.nextInt();
            System.out.print("Sütun Giriniz : ");
            y = scan.nextInt();

            if(x < 0 || x >= this.row || y < 0 || y >= this.col){
                System.out.println("Geçersiz kordinat girdiniz");
                continue;
            }

            if (this.check(x, y)){
                this.printField();
                counter++;

                if(counter == this.row*this.col - this.mines){
                    System.out.println("Oyunu Kazandınız !");
                    this.printMineField();
                    break;
                }
            }
            else {
                System.out.println("Game Over!!");
                System.out.println("===========================");
                break;
            }
        }
    }
}
