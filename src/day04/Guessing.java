package day04;

import java.util.Random;
import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        int guess = ran.nextInt(100);
        System.out.println("猜吧");
        System.out.println(guess);
        int num = scan.nextInt();
        while (true) {
            if (num == -1) {
                System.out.println("程序结束");
                break;
            } else if (guess > num) {
                System.out.println("太小了");
            } else if (guess < num) {
                System.out.println("太大了");
            } else {
                System.out.printf("猜对了");
                break;
            }
            num = scan.nextInt();

        }

    }
}
