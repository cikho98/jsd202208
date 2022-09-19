package ooday03.Practise;

import java.util.Random;

public class FlyObject {
    int width;
    int height;
    int x;
    int y;
    int life;
    int harm;
    int speed;

    FlyObject(int width, int height){
        this.width=width;
        this.height=height;
        y=-height;
        Random ran = new Random();
        x=ran.nextInt(400-width);
        speed= ran.nextInt(3)+1;



    }

    void move(){
        System.out.println("正在移动");
    }
}
