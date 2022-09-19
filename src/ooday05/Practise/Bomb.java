package ooday05.Practise;

import javax.swing.*;

public class Bomb extends SeaObject{
    Bomb(int width, int height, int x, int y, int speed, int harm) {
        super(width, height, x, y, speed, harm);
    }

    @Override
    public void move() {
        System.out.println("bomb move");
    }

    @Override
    public ImageIcon getImage() {
        return Images.bomb;
    }
}
