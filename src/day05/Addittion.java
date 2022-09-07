package day05;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class Addittion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = (int)(Math.random()*1000+1);
        int b = (int)(Math.random()*1000+1);
        int result= a+b;
        int score=0;
        for (int i = 1; i <=10 ; i++) {
            System.out.println("第("+i+")题 "+a+" + "+b+" = ?");
            System.out.println("开始算吧");
            int answer = scan.nextInt();
            if (answer==-1){
                System.out.println("程序结束");
                break;
            }
            if (answer!=result){
                System.out.println("错了");
                score-=10;
                continue;
            }else if(answer==result){
                System.out.println("对了");
                score+=10;
                continue;
            }
        }
        System.out.println(score);


    }
}
