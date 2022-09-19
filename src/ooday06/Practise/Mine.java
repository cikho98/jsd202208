package ooday06.Practise;

import javax.swing.*;

public class Mine extends SeaObject {
    private int harm;

    Mine(int x, int y) {
        super(11, 11, x, y, 1);
    }

    @Override
    public void move() {
        y += speed;
    }

    @Override
    public ImageIcon getImages() {
        return null;
    }
}
