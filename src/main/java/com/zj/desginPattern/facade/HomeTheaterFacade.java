package com.zj.desginPattern.facade;

/**
 * @Author Zhou  jian
 * @Date 2019 ${month}  2019/11/9 0009  18:50
 */
public class HomeTheaterFacade {

    //定义各个子系统对象
    private  TheaterLight theaterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Screen screen;
    private  Projector projector;
    private DvdPlayer dvdPlayer;

    public HomeTheaterFacade() {
        this.theaterLight = theaterLight.getInstance();
        this.popcorn = popcorn.getInstance();
        this.stereo = stereo.getInstance();
        this.screen = screen.getInstance();
        this.projector = projector.getInstance();
        this.dvdPlayer = dvdPlayer.getInstance();
    }

    //操作分成四部
    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    //播放
    public void play(){
        dvdPlayer.play();
    }

    //暂停
    public void  pause(){
        dvdPlayer.pause();
    }

    public void end(){
        popcorn.off();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
        theaterLight.bright();
    }


    public static void main(String[] args) {

    }







}
