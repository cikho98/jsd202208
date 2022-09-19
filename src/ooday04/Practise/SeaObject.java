package ooday04.Practise;

import java.util.Random;

public class SeaObject {
    private int width;
    private int height;
    private int x;
    private int y;
    private int speed;

    SeaObject(int width, int height) {
        this.width = width;
        this.height = height;
        x = -width;
        Random ran = new Random();
        y = ran.nextInt(479 - height - 150 + 10) + 150;
        speed = ran.nextInt(3) + 1;

    }

    SeaObject(int width, int height , int x ,int y ,int speed){
        this.width=width;
        this.height=height;
        this.x=x;
        this.y=y;
        this.speed=speed;
    }


    public void move() {
        System.out.println("海洋类在移动");
    }
}
