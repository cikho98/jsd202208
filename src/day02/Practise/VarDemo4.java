package day02.Practise;

public class VarDemo4 {
    public static void main(String[] args) {
//        1声明初始化两个以上的浮点型变量
        double a=2.001,b=231.323;

//        2声明几个浮点型变量并将它们做数学操作，演示double运算的舍入误差问题
        double c=5.0,d=4.9,e=1.2,f=5.2;
        System.out.println(c-d);
        System.out.println(c-e);
        System.out.println(c-f);

    }
}
