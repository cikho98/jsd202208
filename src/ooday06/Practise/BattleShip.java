package ooday06.Practise;

import javax.swing.*;

public class BattleShip extends SeaObject{
    private int life;

    BattleShip() {
        super(66, 26, 10, 150, 1);
    }

    @Override
    public void move() {

    }

    @Override
    public ImageIcon getImages() {
        return Images.battleship;
    }
}
