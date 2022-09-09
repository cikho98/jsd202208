package day06;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        System.out.println("\n调用say方法");
        say();

        System.out.println("\n调用sayHi方法");
        sayHi("cikho");

        System.out.println("\n调用sayHello方法");
        sayHello("cikho",24);

        System.out.println("\n调用getName方法");
        double a = getName();
        System.out.println(a);

        System.out.println("\n调用plus方法");
        int num1= 4,num2=33;
        int num = plus(num1,num2);
        System.out.println(num);

        System.out.println("\n调用createArrays方法");
        int[] ars = createArrays(10,100);
        for (int i = 0; i < ars.length; i++) {
            System.out.println(ars[i]);

        }

    }

    public static void say(){
        System.out.println("halo");
    }

    public static void  sayHi(String name){
        System.out.println("halo"+name);
    }

    public static void sayHello(String name,int age){
        System.out.println("halo"+name+"，今年"+age);
    }

    public static double getName(){
        return 8.88;
    }

    public static int plus(int num1,int num2){
        return num1+num2;
    }

    public static int[] createArrays(int num,int ranges){
        int[] ars= new int[num];
        Random ran = new Random();
        for (int i = 0; i < num; i++) {
            ars[i]=ran.nextInt(ranges);
        }
        return ars;
    }



}
