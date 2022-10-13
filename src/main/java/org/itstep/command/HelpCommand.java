package org.itstep.command;

public class HelpCommand implements Command {
    @Override
    public void execute(String... str) {
        System.out.println("Help executed");
    }
}
