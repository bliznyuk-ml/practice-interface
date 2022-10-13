package org.itstep.command;

public class ExitCommand implements Command {

    @Override
    public void execute(String... str) {
        System.out.println("Goodbye");
    }
}
