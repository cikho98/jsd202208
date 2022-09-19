package ooday06.Practise;

import javax.swing.*;

public class ObserveSubmarine extends SeaObject{
    ObserveSubmarine() {
        super(63, 19);
    }

    @Override
    public void move() {
        x+=speed;
    }

    @Override
    public ImageIcon getImages() {
        return Images.obsersubm;
    }
}
