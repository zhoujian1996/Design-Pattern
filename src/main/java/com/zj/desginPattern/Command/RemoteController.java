package com.zj.desginPattern.Command;

import java.util.List;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/11 0011  12:08
 */
public class RemoteController {

    //开按钮命令数组
    Command[] onCommands;

    //关按钮命令数组
    Command[] offCommands;

    //撤销按钮命令数组
    Command undoCommand;


    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for(int i=0;i<5;i++){
            onCommands[i]=new NoCommand();
            offCommands[i]=new NoCommand();
        }
    }

    //给我们的announce设置你需要的命令
    public void setCommand(int no,Command oncommand,Command offCommand){
        onCommands[no]=oncommand;
        offCommands[no]=offCommand;
    }

    //按下开的按钮
    public void onButtonWasPushed(int no){
        //找到你按下的开的按钮并调用对应的方法
        onCommands[no].execute();

        //记录这次的操作用于撤销
        undoCommand = onCommands[no];
    }
    //按下关的按钮偶发房
    public void offButtonWasPushed(int no){
        //找到你按下的开的按钮并调用对应的方法
        offCommands[no].execute();

        //记录这次的操作用于撤销
        undoCommand = onCommands[no];
    }

    //按下撤销按钮的处理
    public void  undoButtonWasPushed(){
        undoCommand.undo();
    }





}
