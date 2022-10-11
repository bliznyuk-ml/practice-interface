package org.itstep.command;

public class ExitCommand implements Command{

    @Override
    public void execute(String str) {
        if (str.equals("exit")) {
            System.out.println("Goodbye");
        }
    }
}
