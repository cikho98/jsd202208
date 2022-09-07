package day03.Practise;

public class Practise06 {
    public static void main(String[] args) {
//        声明并初始化整型变量，使用条件运算符实现：若>0则给flag赋值为1，否则赋值为0
        int a=5;
        int num = a>0?1:0;
        System.out.println(num);

//        声明两个整型变量，使用条件运算符实现：求这两个变量的最大值
        int b=10,c=20;
        int max = b>c?b:c;
        System.out.println(max);

    }
}
