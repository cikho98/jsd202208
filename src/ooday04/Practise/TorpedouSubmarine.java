package ooday04.Practise;

public class TorpedouSubmarine extends SeaObject {
    private int life;

    TorpedouSubmarine(){
        super(4,4);
    }

    @Override
    public void move(){
        System.out.println("水雷潜艇x向右移动");
    }

}
