package day02.Practise;

public class VarDemo2 {
    public static void main(String[] args) {
//        1声明初始化两个以上整数变量，并且输出两个整数变量的除法结果
        int a =10,b=26;
        System.out.println(a/b);//0
        System.out.println(b/a);//2
        System.out.println(((float)b/a));

//        2声明两个很大的变量，然后相加，输出运算结果，测试运算溢出现象
        int q=1000000000,w=2000000000;
        System.out.println(q+w);

    }
}
