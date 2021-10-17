import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {
        int day, month;
        String zodiac = "";
        boolean error = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ay: ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün: ");
        day = input.nextInt();

        if(month<1 || month>12)
            error = true;

        else if(month == 1){

            if (day < 1 || day > 31){
                error = true;
            }

            else if(day <= 21)
                zodiac = "Oğlak burcu";

            else zodiac ="Kova burcu";
        }

        else if(month == 2){

            if (day < 1 || day > 29){
                error = true;
            }

            else if(day <= 19)
                zodiac = "Kova burcu";

            else zodiac = "Balık burcu";

        }
        else if(month == 3){

            if (day < 1 || day > 31){
                error = true;
            }

            else if(day <= 20)
                zodiac = "Balık burcu";

            else zodiac = "Koç burcu";

        }
        else if(month == 4){

            if (day < 1 || day > 30){
                error = true;
            }

            else if(day <= 20)
                zodiac = "Koç burcu";

            else zodiac = "Boğa burcu";

        }
        else if(month == 5){

            if (day < 1 || day > 31){
                error = true;
            }

            else if(day <= 21)
                zodiac = "Boğa burcu";

            else zodiac = "İkizler burcu";

        }
        else if(month == 6){

            if (day < 1 || day > 30){
                error = true;
            }

            else if(day <= 22)
                zodiac = "İkizler burcu";

            else zodiac = "Yengeç burcu";

        }
        else if(month == 7){

            if (day < 1 || day > 31){
                error = true;
            }

            else if(day <= 22)
                zodiac = "Yengeç burcu";

            else zodiac = "Aslan burcu";

        }
        else if(month == 8){

            if (day < 1 || day > 31){
                error = true;
            }

            else if(day <= 22)
                zodiac = "Aslan burcu";

            else zodiac = "Başak burcu";

        }
        else if(month == 9){

            if (day < 1 || day > 30){
                error = true;
            }

            else if(day <= 22)
                zodiac = "Başak burcu";

            else zodiac = "Terazi burcu";

        }
        else if(month == 10){

            if (day < 1 || day > 31){
                error = true;
            }

            else if(day <= 22)
                zodiac = "Terazi burcu";

            else zodiac = "Akrep burcu";

        }
        else if(month == 11){

            if (day < 1 || day > 30){
                error = true;
            }

            else if(day <= 21)
                zodiac = "Akrep burcu";

            else zodiac = "Yay burcu";

        }
        else if(month == 12){

            if (day < 1 || day > 31){
                error = true;
            }

            else if(day <= 21)
                zodiac = "Yay burcu";

            else zodiac = "Oğlak burcu";
        }

        if (error)
            System.out.print("Hatalı giriş yaptınız! Tekrar deneyiniz.");
        else
            System.out.print(zodiac);
    }
}