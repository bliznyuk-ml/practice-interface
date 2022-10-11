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
            //System.out.println(str);
            help.execute(str);
            now.execute(str);
            echo.execute(str);
            exit.execute(str);
            if (!str.equals("help") && !str.equals("now") && !str.equals("exit") && !str.contains("echo")){
                System.out.println("Error");
            }
        }
    }
}
