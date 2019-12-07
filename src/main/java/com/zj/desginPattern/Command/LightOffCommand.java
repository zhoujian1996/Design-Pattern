package com.zj.desginPattern.Command;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/11 0011  12:06
 */
public class LightOffCommand implements Command {
    private  LightReciever lightReciever;

    public LightOffCommand(LightReciever lightReciever) {
        this.lightReciever = lightReciever;
    }

    public void execute() {
        //调用接受者方法
        lightReciever.off();
    }

    public void undo() {
        //调用接受者方法
        lightReciever.on();
    }
}
