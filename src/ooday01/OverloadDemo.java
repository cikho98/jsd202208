package ooday01;
import ooday01.Aoo;


public class OverloadDemo {
    public static void main(String[] args) {
        Aoo o  = new Aoo();
        o.show();
        o.show("cikho");
        o.show(24);
        o.show("张三",24);
//        o.show(251.44);

    }
}
