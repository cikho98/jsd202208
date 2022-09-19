package ooday06.Practise;

import javax.swing.ImageIcon;

public class Images {
    public static  ImageIcon sea;
    public static  ImageIcon battleship;
    public static  ImageIcon bomb;
    public static  ImageIcon mine;
    public static  ImageIcon minesubm;
    public static  ImageIcon obsersubm;
    public static  ImageIcon toprpesubm;
    public static  ImageIcon gameover;

    static{
        String img_path=Settings.IMGPATH;
        sea=new ImageIcon(img_path+"sea.png");
        bomb=new ImageIcon(img_path+"bomb.png");
        battleship=new ImageIcon(img_path+"battleship.png");
        gameover=new ImageIcon(img_path+"gameover.png");
        toprpesubm=new ImageIcon(img_path+"toprpesubm.png");
        obsersubm=new ImageIcon(img_path+"obsersubm.png");
        mine=new ImageIcon(img_path+"mine.png");
        minesubm=new ImageIcon(img_path+"minesubm.png");
    }


    public static void main(String[] args) {
        System.out.println(sea.getImageLoadStatus());
    }



}
