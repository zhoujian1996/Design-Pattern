package com.zj.desginPattern.Command;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/11 0011  11:56
 */
//创建命令接口
public interface Command {

    //执行某个操作
    void execute();

    //撤销某个动作
    void undo();


}
