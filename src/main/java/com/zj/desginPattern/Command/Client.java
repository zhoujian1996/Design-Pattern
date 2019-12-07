package com.zj.desginPattern.Command;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/11 0011  11:58
 */
public class Client {

    public static void main(String[] args) {
        //使用命令设计模式，完成通过遥控器，对电灯操作

        //创建电灯的对象（接收者）
        LightReciever lightReciever = new LightReciever();

        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReciever);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReciever);

        //需要一个遥控器
        RemoteController remoteController = new RemoteController();

        /*给遥控器设置命令，比如no = 0是电灯的开和关的操作 */
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        System.out.println("--------按下灯开按钮----------");
        remoteController.onButtonWasPushed(0);

        System.out.println("--------按下灯关按钮----------");
        remoteController.offButtonWasPushed(0);

        System.out.println("--------按下撤销按钮----------");
        remoteController.undoButtonWasPushed();


    }
}
