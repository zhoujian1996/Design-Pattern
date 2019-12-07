package com.zj.desginPattern.Command;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/11 0011  12:06
 */
public class LightOnCommand implements Command {

    private  LightReciever lightReciever;

    public LightOnCommand(LightReciever lightReciever) {
        this.lightReciever = lightReciever;
    }

    public void execute() {
        lightReciever.on();
    }

    public void undo() {
        lightReciever.off();
    }
}
