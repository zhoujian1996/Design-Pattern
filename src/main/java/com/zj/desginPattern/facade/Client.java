package com.zj.desginPattern.facade;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/9 0009  18:48
 */
public class Client {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

        homeTheaterFacade.ready();

        homeTheaterFacade.play();

        homeTheaterFacade.pause();

        homeTheaterFacade.end();
    }
}
