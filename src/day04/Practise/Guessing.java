package day04.Practise;

import java.util.Map;
import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = (int) (Math.random() * 1000 + 1);
        System.out.println(num);
        System.out.println("请输入你猜的数字:");
        int guess = scan.nextInt();
        while (true) {
            if (guess == -1) {
                System.out.println("程序结束");
                break;
            } else if (guess > num) {
                System.out.println("太大了");
            } else if (guess < num) {
                System.out.println("太小了");
            } else {
                System.out.println("恭喜你猜对了");
                break;
            }
            System.out.println("重新猜：");
            guess = scan.nextInt();
        }
    }
}
