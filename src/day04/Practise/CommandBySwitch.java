package day04.Practise;

import java.util.Scanner;

public class CommandBySwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你要操作，1-打电话，2-发短信，3-买东西 ，4-卖水果");
        int num = scan.nextInt();
        switch (num) {
            case 1:
                System.out.println("正在打电话");
                break;
            case 2:
                System.out.println("正在发短信");
                break;
            case 3:
                System.out.println("正在买东西");
                break;
            case 4:
                System.out.println("正在卖水果");
                break;
            default:
                System.out.println("无效参数");
        }

    }
}
