package ooday03;

import java.util.Random;

public class UpCastDemo {
    public static void main(String[] args) {
        Aoo o3= new Boo();
        o3.a=1;
        o3.show();

        Random ran = new Random();
        int g = ran.nextInt(2);
        System.out.println(g);


    }
}
