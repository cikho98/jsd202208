package day03.Practise;

public class Practise02 {
    public static void main(String[] args) {
//        声明几个变量，演示最基本的>，<，>=，<=，==，!=操作
        int a=5,b=12,c=5;
        System.out.println(a>b);//f
        System.out.println(a<b);//t
        System.out.println(a>=b);//f
        System.out.println(a<=b);//t
        System.out.println(a==c);//t
        System.out.println(a!=b);//t


//        演示关系运算符和算术运算符联合使用的效果

        System.out.println(b>a+c);//t
        System.out.println(b%c==2);//t
        System.out.println(b-c==2);//2
        System.out.println(c++>5);
        c=5;
        System.out.println(++c>5);





    }
}
