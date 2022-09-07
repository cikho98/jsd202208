package day02.Practise;

public class VarDemo {
    public static void main(String[] args) {
//        1声明一个变量，一次声明多个变量。
        int a;

//        2声明变量直接初始化，先声明变量，而后再给变量初始化。
        int b,c,d;
        b=c=d=1;

//        3声明整型变量g，声明另一个整型变量h并赋值为g+10，输出变量h的值。
        int g=100;
        int h = g+10;
        System.out.println(h);

//        4在g本身基础之上增10，输出变量g的值。
        g+=10;
        System.out.println(g);

//        5声明一些正确的和错误的变量名。
//        正确：
        int aa=1;
//        int a=1
        int a_;
        int kk$;
        int 我;
        int _3;


//        错误：
//        int 3
//        int class
//        int b*c


    }
}
