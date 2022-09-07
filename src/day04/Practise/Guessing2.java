package day04.Practise;

import java.util.Scanner;

public class Guessing2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = (int) (Math.random() * 1000 + 1);
        int guess;
        System.out.println(num);

        do {
            System.out.println("猜吧：");
            guess = scan.nextInt();
            if (num == -1) {
                System.out.println("程序结束");
                break;
            } else if (guess > num) {
                System.out.println("太大了");
            } else if (guess < num) {
                System.out.println("太小了");
            } else {
                System.out.println("恭喜你猜对了");
            }
        } while (guess != num);
    }
}
