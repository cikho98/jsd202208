package day03.Practise;

public class Practise03 {
    public static void main(String[] args) {
//        &&的演示要求：true+false、false+true、true+true、false+false
//        t+f
        int a=5,b=10,c=5;
        System.out.println(a==c && a>b);
        System.out.println(b==c && a<b);//f+t\
        System.out.println(a+c==b && c!=2); //t+t
        System.out.println(a>10 && a>c);//f+f

//        ||的演示要求：true+false、false+true、true+true、false+false
        System.out.println(a==c || a>b);
        System.out.println(b==c || a<b);//f+t\
        System.out.println(a+c==b || c!=2); //t+t
        System.out.println(a>10 || a>c);//f+f

//        !的演示要求：true、false
        System.out.println(a==c | b++==11);
        System.out.println(b);
        System.out.println(a++==6);
        boolean b2 = a+c==b && a==c;
        System.out.println(b2);

    }
}
