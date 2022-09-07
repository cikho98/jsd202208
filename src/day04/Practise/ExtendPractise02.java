package day04.Practise;

import java.util.Scanner;
import day03.Practise.YearJudge;

public class ExtendPractise02 {
    public static void main(String[] args) {
//        接收用户输入的年份year和月份month，计算该年该月的天数，并输出
        Scanner scan =new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scan.nextInt();
        System.out.println("请输入月份：");
        int month = scan.nextInt();
        int day=0;
        YearJudge YJ= new YearJudge();
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day=30;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day=31;
                break;
            case 2:
                if (YJ.yearsJudge(year)){
                    System.out.println("是平年");
                    day=28;
                }else {
                    day=29;
                }
        }




        System.out.println(year+"年"+month+"月有"+day+"日");


    }
}
