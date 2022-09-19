package ooday05.Practise;

import javax.swing.ImageIcon;

public class Battleship extends SeaObject{
    Battleship() {
        super(66, 26,150,150,3,1);
    }

    @Override
    public void move() {
        System.out.println("ship move");
    }

    @Override
    public ImageIcon getImage() {
        return Images.battleship;
    }
}
