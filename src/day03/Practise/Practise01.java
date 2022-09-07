package day03.Practise;

public class Practise01 {
    public static void main(String[] args) {
//        输出几个整数取模，验证结果
        System.out.println(5%3);
        System.out.println(5%5);
        System.out.println(3%9);

//        声明两个整型变量，演示单独使用时的自增和自减
        int a =5,b=5;
        a++;
        b++;
        System.out.println(a);
        System.out.println(b);

//        声明几个整型变量，演示被使用时的自增和自减
        int c=5,d=5;
        int e=c++;
        int f=++d;
        System.out.println("c++: "+c);
        System.out.println("++d: "+d);
        System.out.println("e=c++: "+e);
        System.out.println("f=+=d: "+f);

    }
}
