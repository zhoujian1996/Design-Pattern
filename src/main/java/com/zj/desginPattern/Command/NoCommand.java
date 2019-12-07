package com.zj.desginPattern.Command;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/11 0011  12:10
 */

/**
 * 没有任何命令即控制性，用于初始化按钮，当调用空命令时，对象什么也不做
 * 其实也是一种设计模式
 */
public class NoCommand implements Command {
    public void execute() {

    }

    public void undo() {

    }
}
