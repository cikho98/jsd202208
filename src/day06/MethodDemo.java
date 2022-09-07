package day06;

import java.util.Random;

public class MethodDemo {
    public static void main(String[] args) {
        say();
        say();

        sayHi("cikho");
        sayHi("cikho", 25);

        double a = getNum();
        System.out.println(a);

        Random ran = new Random();

        int num1 = ran.nextInt(100);
        int num2 = ran.nextInt(100);


        int num = plus(num1, num2);
        System.out.println(num);


        int[] arr = createArrays(10, 100);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        ;


    }

    public static int[] createArrays(int num, int ran_num) {
        int[] arrays = new int[num];
        Random ran = new Random();
        for (int i = 0; i < num; i++) {
            arrays[i] = ran.nextInt(ran_num);
        }
        return arrays;
    }


    public static void say() {
        System.out.println("halo");
    }

    public static void sayHi(String name) {
        System.out.println("大家好，我叫" + name + ",今年24岁了");
    }

    public static void sayHi(String name, int age) {
        System.out.println("大家好，我叫" + name + ",今年" + age + "岁了");
    }

    public static double getNum() {
        return 8.88;
    }

    public static int plus(int num1, int num2) {
        int num = num1 = num2;
        return num;
    }


}
