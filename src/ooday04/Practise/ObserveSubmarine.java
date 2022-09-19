package ooday04.Practise;

public class ObserveSubmarine extends SeaObject {
    private int life;

    ObserveSubmarine(){
        super(4,4);
    }

    @Override
    public void move(){
        System.out.println("侦查潜艇x向右移动");
    }


}
