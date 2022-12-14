package ooday04.Practise;

import javax.swing.ImageIcon;

public class Images {
    public static ImageIcon sea;
    public static ImageIcon gameover;
    public static ImageIcon battleship;
    public static ImageIcon obsersubm;
    public static ImageIcon torpesubm;
    public static ImageIcon minesubm;
    public static ImageIcon mine;
    public static ImageIcon bomb;

    static { //初始化静态图片
        battleship = new ImageIcon("img/battleship.png");
        obsersubm = new ImageIcon("img/obsersubm.png");
        torpesubm = new ImageIcon("img/torpesubm.png");
        minesubm = new ImageIcon("img/minesubm.png");
        mine = new ImageIcon("img/mine.png");
        bomb = new ImageIcon("img/bomb.png");
        sea = new ImageIcon("img/sea.png");
        gameover = new ImageIcon("img/gameover.png");
    }

    public static void main(String[] args) {
        System.out.println(battleship.getImageLoadStatus()); //返回8表示读取成功，否则表示失败
        System.out.println(obsersubm.getImageLoadStatus());
        System.out.println(torpesubm.getImageLoadStatus());
        System.out.println(minesubm.getImageLoadStatus());
        System.out.println(mine.getImageLoadStatus());
        System.out.println(bomb.getImageLoadStatus());
        System.out.println(sea.getImageLoadStatus());
        System.out.println(gameover.getImageLoadStatus());
    }

}
