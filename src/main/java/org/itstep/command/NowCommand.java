package org.itstep.command;

public class NowCommand implements Command{

    @Override
    public void execute(String str){
        if (str.equals("now")) {
            System.out.println(System.currentTimeMillis());
        }
    }
}
