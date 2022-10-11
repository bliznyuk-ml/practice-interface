package org.itstep.command;

public class EchoCommand implements Command{
    @Override
    public void execute(String str) {
        if (str.contains("echo")) {
            System.out.println(str.substring(5));
        }
    }
}
