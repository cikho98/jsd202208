package day04;

import java.util.Scanner;

public class Guessing2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = (int) (Math.random() * 1000 + 1);
        System.out.println(num);
        int guess;
        do {
            System.out.println("猜吧");
            guess = scan.nextInt();
            if (num > guess) {
                System.out.println("太小了");
            } else {
                System.out.println("太大了");
            }
            guess = scan.nextInt();
        } while (num != guess);
        System.out.println("恭喜猜对了");








        /*
        System.out.println("猜吧");
        int guess = scan.nextInt();
        while (num!=guess){
            if (num>guess){
                System.out.println("太小了");
            }else{
                System.out.println("太大了");
            }
            guess= scan.nextInt();
        }
        System.out.println("恭喜猜对了");

         */


    }
}
