package operations.arabic;

public class Plus {

    public void getSumm(String input) {

        String[] rome = {"X", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        //разбиваем входящую строку на составляющие
        int indexPlus = input.indexOf("+");
        int endOfString = input.length();

        String firstItem = input.substring(0, indexPlus);
        String secondItem = input.substring(indexPlus + 1, endOfString);

        if (firstItem.equals(rome[0])) {
            firstItem = "10";
        } else if (firstItem.equals(rome[1])) {
            firstItem = "1";
        } else if (firstItem.equals(rome[2])) {
            firstItem = "2";
        } else if (firstItem.equals(rome[3])) {
            firstItem = "3";
        } else if (firstItem.equals(rome[4])) {
            firstItem = "4";
        } else if (firstItem.equals(rome[5])) {
            firstItem = "5";
        } else if (firstItem.equals(rome[6])) {
            firstItem = "6";
        } else if (firstItem.equals(rome[7])) {
            firstItem = "7";
        } else if (firstItem.equals(rome[8])) {
            firstItem = "8";
        } else if (firstItem.equals(rome[9])) {
            firstItem = "9";
        }

        if (secondItem.equals(rome[0])) {
            secondItem = "10";
        } else if (secondItem.equals(rome[1])) {
            secondItem = "1";
        } else if (secondItem.equals(rome[2])) {
            secondItem = "2";
        } else if (secondItem.equals(rome[3])) {
            secondItem = "3";
        } else if (secondItem.equals(rome[4])) {
            secondItem = "4";
        } else if (secondItem.equals(rome[5])) {
            secondItem = "5";
        } else if (secondItem.equals(rome[6])) {
            secondItem = "6";
        } else if (secondItem.equals(rome[7])) {
            secondItem = "7";
        } else if (secondItem.equals(rome[8])) {
            secondItem = "8";
        } else if (secondItem.equals(rome[9])) {
            secondItem = "9";
        }

        // Преобразовываем полученные составляющие в целочисленные значения
        int num1 = Integer.parseInt(firstItem);
        int num2 = Integer.parseInt(secondItem);

        // Проверяем на допустимый диапозон введенных значений
        if (num1 > 0 && num1 <= 10 && num2 > 0 && num2 <= 10) {
            System.out.println(num1 + num2);

        } else System.out.println("Диапозон допустумых вводимых чисел от 1 до 10.");
        System.out.println("Повторите ввод: ");
    }
}
