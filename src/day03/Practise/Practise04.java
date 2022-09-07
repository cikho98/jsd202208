package day03.Practise;

public class Practise04 {
    public static void main(String[] args) {
//        声明一个整型变量，演示扩展赋值+=、-=、*=、/=、%=的效果
        int a =5;
        System.out.println(a+=5);
        System.out.println(a-=5);
        System.out.println(a*=2);
        System.out.println(a/=2);
        System.out.println(a%=3);
        System.out.println(a);

//        声明short型变量s，演示简单赋值运算的自增10，演示扩展赋值运算的自增10
        short s=4;
        s=(short)(s+10);
        System.out.println(s);//14

        System.out.println(s+=10);//24


    }
}
