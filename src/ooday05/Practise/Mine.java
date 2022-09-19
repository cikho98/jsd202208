package ooday05.Practise;

import javax.swing.ImageIcon;

public class Mine extends SeaObject{
    private int harm;



    Mine(int width, int height, int x, int y, int speed,int harm) {
        super(width, height, x, y, speed,harm);
    }

    @Override
    public void move() {
        System.out.println("mine move");
    }

    @Override
    public ImageIcon getImage() {
        return Images.mine;
    }
}
