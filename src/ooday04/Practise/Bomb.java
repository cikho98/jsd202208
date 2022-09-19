package ooday04.Practise;

public class Bomb extends SeaObject{
    private int harm;

    Bomb(int x,int y){
        super(11,11,x,y,1);
    }

    @Override
    public void move(){
        System.out.println("炸弹y向下移动");
    }


}
