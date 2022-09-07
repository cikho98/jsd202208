package day02.Practise;

public class VarDemo7 {
    public static void main(String[] args) {
//        声明几个变量，演示自动类型转换和强制类型转换的语法
//        byte>shot>int>long>float>double
        byte a=1;
        int b =a;
        System.out.println(b);

        long long1=123123L;
        int c = (int)long1;
        System.out.println(c);


//        声明一个较大类型的长整型变量，演示强转可能会发生的溢出问题
        long long2 = 3000000000L;
        int d = (int)long2;
        System.out.println(d);


//        声明一个较大精度的浮点型变量，演示强转可能会发生的丢失精度问题
        double double1=1.25442;
        int int1=(int)double1;
        System.out.println(int1);

    }
}
