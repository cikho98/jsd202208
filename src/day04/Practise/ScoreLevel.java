package day04.Practise;

import java.util.Scanner;

public class ScoreLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();

        if(score<0 || score>100){
            System.out.println("不合法数据");
        }else  if (score>=90){
            System.out.println("优秀");
        }else if (score>=80){
            System.out.println("良好");

        }else if (score>=60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
    }

}
