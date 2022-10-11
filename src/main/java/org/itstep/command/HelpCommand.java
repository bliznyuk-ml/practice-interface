package org.itstep.command;

public class HelpCommand implements Command {


    @Override
    public void execute(String str) {
        if (str.equals("help")) {
            System.out.println("Help executed");
        }
    }
}
