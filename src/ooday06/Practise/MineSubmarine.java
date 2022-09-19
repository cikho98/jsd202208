package ooday06.Practise;

import ooday05.Practise.Images;

import javax.swing.*;

public class MineSubmarine extends SeaObject{

    MineSubmarine(){
        super(63,19);
    }

    @Override
    public void move() {
        x+=speed;
    }

    @Override
    public ImageIcon getImages() {
        return Images.minesubm;
    }

    public Mine shootMine(){
        return new Mine(x+width,y-11);
    }
}
