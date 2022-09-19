package ooday04.Practise;

public class Mine extends SeaObject{

    Mine(int x,int y){
        super(11,11,x,y,1);
    }

    @Override
    public void move(){
        System.out.println("水雷y向上移动");
    }

}
