package ooday04.Practise;

public class Battleship extends SeaObject {
    private int life;

    Battleship() {
        super(4, 4);
    }

    @Override
    public void move() {
        System.out.println("战舰在移动");
    }


}
