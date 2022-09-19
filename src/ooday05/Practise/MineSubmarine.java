package ooday05.Practise;

import javax.swing.*;

public class MineSubmarine extends SeaObject{
    private int life;

    MineSubmarine() {
        super(-100, 19);
    }


    @Override
    public void move() {
        System.out.println("minesub move");
    }

    @Override
    public ImageIcon getImage() {
        return Images.minesubm;
    }
}
