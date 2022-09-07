package day03;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        while (true) {
            System.out.println("请输入数字：");
            int num = scan.nextInt();
            if (num==-1){
                System.out.println("程序结束");
                break;
            }
            if (num % 2 == 0) {
                System.out.println(num+"是偶数");
            }else{
                System.out.println(num+"是奇数")
            }
            System.out.println("继续操作");

        }

         */

        double price =300.0;
        if (price>500){
            price*=0.8;
        }else{
            price*=0.9;
        }
        System.out.println("最终结算金额为： "+price);

        int age = 24;
        if (age>=18&&age<=50){
            System.out.println("青年人");
        }
        System.out.printf("继续执行。。。。。。");






    }

}
