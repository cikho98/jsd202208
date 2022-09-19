package ooday05.Practise;

import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.util.Random;

public abstract class SeaObject{
    public static final int LIVE=0;
    public static final int DEAD=1;

    protected int state=LIVE;


    protected int width;
    protected int height;
    protected int x;
    protected int y;
    protected int speed;
    protected int harm;

    SeaObject(int width,int height){
        this.width=width;
        this.height=height;
        x=-width;
        Random ran = new Random();
        y=ran.nextInt(World.HEIGHT-height-150+1)+150;
        speed = ran.nextInt(3)+1;
    }

    SeaObject(int width,int height,int x,int y ,int speed,int harm){
        this.width=width;
        this.height=height;
        this.x=x;
        this.y=y-height;
        this.speed=speed;
        this.harm=harm;
    }


    public abstract void move();

    public abstract ImageIcon getImage();

    public boolean isLive(){
        return state==LIVE;
    }

    public boolean isDead(){
        return state==DEAD;
    }

    public void plantImage(Graphics g){
        getImage().paintIcon(null,g,x,y);
    }
}
