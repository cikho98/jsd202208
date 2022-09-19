package ooday06.Practise;


import javax.swing.*;
import java.awt.*;
import java.util.Random;

public abstract class SeaObject {


    protected int width;
    protected int height;
    protected int x;
    protected int y;
    protected int speed;

    SeaObject(int width, int height){
        this.width=width;
        this.height=height;
        x=-width;
        Random ran= new Random();
        y=ran.nextInt(World.HEIGHT-height-150+1)+150;
        speed=ran.nextInt(3)+1;
    }

    SeaObject(int width,int height,int x,int y,int speed){
        this.width=width;
        this.height=height;
        this.x=x;
        this.y=y-height;
        this.speed=speed;
    }

    public abstract void move();

    public abstract ImageIcon getImages();

    public void plantImage(Graphics g){
        getImages().paintIcon(null,g,x,y);
    }


}
