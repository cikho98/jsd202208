package ooday05.Practise;

import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.JPanel;



public class World extends  JPanel{
    public static final int WIDTH=641;
    public static final int HEIGHT=479;


    private Battleship ship = new Battleship();
    private SeaObject[] subs={
      new TorpedoSubmarine(),
            new MineSubmarine(),
            new ObserveSubmaine()
    };
    private Mine[] mines={
            new Mine(11,11,200,200,1,1)
    };
    private Bomb[] bombs ={
            new Bomb(11,11,ship.x,(ship.height)/2+ship.y,1,1)
    };

    @Override
    public void paint(Graphics g){
        Images.sea.paintIcon(null,g,0,0);
        ship.plantImage(g);
        for (SeaObject sub:subs){
            sub.plantImage(g);
        }
        for (Mine mine:mines){
            mine.plantImage(g);
        }
        for (Bomb bomb :bombs){
            bomb.plantImage(g);
        }



    }





    public static void main(String[] args) {
        JFrame frame = new JFrame(); //3.
        frame.setVisible(true); //1)设置窗口可见
        World world = new World();
        world.setFocusable(true);
        frame.add(world);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH + 16, HEIGHT + 39);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); //1)设置窗口可见  2)尽快调用paint()方法

    }

}
