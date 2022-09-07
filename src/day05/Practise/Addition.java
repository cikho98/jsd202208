package day05.Practise;

import java.util.Scanner;

//Addition随机加法运算器：由系统随机出10道加法题，而后由
// 用户来答题，答题后输出"答对了"或"答错了"，答对1题得10分，答错1题
// 不扣分,最后输出总分数。


public class Addition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        for (int i = 1; i <= 10; i++) {
            int a = (int) (Math.random() * 100 + 1);
            int b = (int) (Math.random() * 100 + 1);
            int result = a + b;
            System.out.println("第" + i + "道 " + a + " + " + b + " = ?");
            System.out.println("答吧");
            int answer = scan.nextInt();

            if (result==-1){
                System.out.println("程序结束");
                break;
            }

            if (answer == result) {
                System.out.println("恭喜你答对了，分数加10");
                score += 10;
            } else {
                System.out.println("答错了");
            }
        }
        System.out.println("总分：" + score);
    }
}
