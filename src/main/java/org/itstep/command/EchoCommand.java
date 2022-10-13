package org.itstep.command;

public class EchoCommand implements Command {
    @Override
    public void execute(String... str) {
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println();
    }
}
