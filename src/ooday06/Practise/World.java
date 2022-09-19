package ooday06.Practise;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class World extends JPanel {
    public static final int WIDTH = 641;
    public static final int HEIGHT = 479;
    Random ran = new Random();


    private BattleShip ship = new BattleShip();
    private SeaObject[] submarines = {};
    private Mine[] mines = {};
    private Bomb[] bombs = {};


    private SeaObject nextSubmarine() {
        int type = ran.nextInt(20);
        if (type < 10) {
            return new ObserveSubmarine();
        } else if (type < 15) {
            return new TorpedorSubmarine();
        } else {
            return new MineSubmarine();
        }
    }

    private void action() {
        Timer timer = new Timer();
        int interval = 10;
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                submarinesAction();
                mineEnterAction();
                moveAction();
                repaint();
            }
        }, interval, interval);
    }

    private int submarine = 0;
    private void submarinesAction() {
        submarine++;
        if (submarine % 40 == 0) {
            SeaObject seo = nextSubmarine();
            submarines = Arrays.copyOf(submarines, submarines.length + 1);
            submarines[submarines.length - 1] = seo;
        }
    }

    private int mineIndex = 0;
    private void mineEnterAction() {
        mineIndex++;
        if (mineIndex % 100 == 0) {
        }
    }

    private void moveAction() {
        for (SeaObject sub : submarines) {
            sub.move();
        }
        for (Mine mine : mines) {
            mine.move();
        }
        for (Bomb bomb : bombs) {
            bomb.move();
        }
    }


    @Override
    public void paint(Graphics g) {
        Images.sea.paintIcon(null, g, 0, 0);
        ship.plantImage(g);
        for (SeaObject seo:submarines){
            seo.plantImage(g);
        }
        for (Mine mine : mines){
            mine.plantImage(g);
        }
        for (Bomb bomb : bombs){
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
        world.action();
    }
}
