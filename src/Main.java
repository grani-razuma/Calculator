import operations.logic.MainLogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {

        //Создаем объект ввода строки.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            // создаем из объекта вводу строку.
            String input = reader.readLine();

            MainLogic calc = new MainLogic();
            calc.getResult(input.replaceAll(" ", ""));
        }
    }
}
