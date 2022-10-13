package org.itstep;

import org.itstep.command.*;

import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Пишите ваш код здесь
        Scanner scanner = new Scanner(System.in);
        String str = "";

        Command help = new HelpCommand();
        Command now = new NowCommand();
        Command exit = new ExitCommand();
        Command echo = new EchoCommand();

        while (!str.equals("exit")) {
            str = scanner.nextLine();
            String[] arrStr = str.split("\\s");

            if (arrStr[0].equals("help")) {
                help.execute(arrStr);
            }

            if (arrStr[0].equals("now")) {
                now.execute(arrStr);
            }

            if (arrStr[0].equals("echo")) {
                echo.execute(Arrays.copyOfRange(arrStr, 1, arrStr.length));
            }

            if (arrStr[0].equals("exit")) {
                exit.execute(arrStr);
            }

            if (!str.equals("help") && !str.equals("now") && !str.equals("exit") && !str.contains("echo")) {
                System.out.println("Error");
            }
        }
    }
}
