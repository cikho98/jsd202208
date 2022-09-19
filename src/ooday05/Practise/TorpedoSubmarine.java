package ooday05.Practise;

import javax.swing.*;

public class TorpedoSubmarine extends SeaObject{
    TorpedoSubmarine() {
        super(-100, 20);
    }

    @Override
    public void move() {

    }

    @Override
    public ImageIcon getImage() {
        return Images.torpesubm;
    }
}
