package day03.Practise;

public class ExtenPractise01 {
    public static void main(String[] args) {
        //    声明两个整型变量a和b并分别赋值，找到a和b中的最大值，并输出。用两种方式实现：条件运算符、if..else分支结构。
        int a =10,b=20;
        int max =a>b?a:b;
        System.out.println(max);

        if (a>b){
            max=a;
        }else {
            max=b;
        }
        System.out.println(max);


    }



}
