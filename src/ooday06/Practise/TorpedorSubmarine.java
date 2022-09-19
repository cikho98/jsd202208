package ooday06.Practise;

import javax.swing.*;

public class TorpedorSubmarine extends SeaObject{
    TorpedorSubmarine() {
        super(64, 20);
    }

    @Override
    public void move() {
        x+=speed;
    }

    @Override
    public ImageIcon getImages() {
        return Images.toprpesubm;
    }
}
