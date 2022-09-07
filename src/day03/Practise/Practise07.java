package day03.Practise;

import java.util.Scanner;

public class Practise07 {
    public static void main(String[] args) {
//        偶数的判断：声明并初始化一个整型变量，判断该数是否是偶数
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("请输入数字：");
            int num = scan.nextInt();
            if (num==-1){
                System.out.println("程序解除");
                break;
            }
            if (num%2==0){
                System.out.println("是偶数");
            }else{
                System.out.println("是奇数");
            }
        }

        System.out.println("------------");
        double price=455;
        if (price>500){
            price*=0.8;
            System.out.println("打折价格: "+price);
        }


    }
}
