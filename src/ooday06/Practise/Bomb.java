package ooday06.Practise;

import javax.swing.*;

public class Bomb extends SeaObject{
    private int hram;

    Bomb(int x, int y) {
        super(9, 12,x,y,1);
    }

    @Override
    public void move() {
        y+=speed;
    }

    @Override
    public ImageIcon getImages() {
        return Images.bomb;
    }
}
