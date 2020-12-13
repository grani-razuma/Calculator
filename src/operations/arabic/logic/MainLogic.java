package operations.arabic.logic;

import operations.arabic.*;

public class MainLogic {

    public void getResult(String input) {

        // Проверяем операцию на +
        if (input.contains("+")) {
            Plus summ = new Plus();
            summ.getSumm(input);
        }

        // Проверяем операцию на -
        if (input.contains("-")){
            Minus minus = new Minus();
            minus.getMinus(input);
        }

        // Проверяем операцию на /
        if (input.contains("/")){
            Division dev = new Division();
            dev.getDivision(input);
        }

        // Проверяем операцию на *
        if (input.contains("*")){
            Multiplication mult = new Multiplication();
            mult.getMultiplication(input);
        }
    }
}
