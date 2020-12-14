package operations;

import java.util.Arrays;

import static operations.logic.RomeNumbers.arabicToRoman;
import static operations.logic.RomeNumbers.romanToArabic;

public class Division {

    public void getDivision(String input){

        int num1;
        int num2;
        int result;

        String[] rome = {"X", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        //разбиваем входящую строку на составляющие
        int indexPlus = input.indexOf("/");
        int endOfString = input.length();

        String firstItem = input.substring(0, indexPlus);
        String secondItem = input.substring(indexPlus + 1, endOfString);

        if (Arrays.asList(rome).contains(firstItem) && Arrays.asList(rome).contains(secondItem)){
            num1 = romanToArabic(firstItem);
            num2 = romanToArabic(secondItem);
            if (num1 > 0 && num1 <= 10 && num2 > 0 && num2 <= 10) {
                result = num1 / num2;
                System.out.println(arabicToRoman(result));
            }else System.out.println("Диапозон допустимых значений от 1 до 10.");

        }
        else {
            num1 = Integer.parseInt(firstItem);
            num2 = Integer.parseInt(secondItem);
            if (num1 > 0 && num1 <= 10 && num2 > 0 && num2 <= 10){
                result = Integer.parseInt(firstItem) / Integer.parseInt(secondItem);
                System.out.println(result);
            } else System.out.println("Диапозон допустимых значений от 1 до 10.");
        }
        System.out.println("Повторите ввод: ");
    }
}
