package ooday04.Practise;

public class MineSubmarine extends SeaObject {
    private int life;


    MineSubmarine(){
        super(4,6);
    }


    @Override
    public void move(){
        System.out.println("水雷潜艇向右移动");
    }


}
