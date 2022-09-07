package day05.Practise;

public class ArrayDemo {
    public static void main(String[] args) {
//        数组小代码练习：声明
//        定义至少两个数组，设计包含一些元素
        int[]arr = new int[2];

//        数组小代码练习：初始化
//                - 定义至少三个数组，演示三种元素初始化方式

        int[] arr1 = new int[10];
        int[] arr2 = {2,3,5,6};
        int[] arr3 = new int[]{2,3};

        int[] arr4;
        arr4=new int[]{100,2};

        int[] arr5;
        arr5=new int[10];

//        数组小代码练习：访问
//
//                - 定义数组，输出数组的长度
//                - 定义数组并分别给每个元素赋值，输出最后一个元素的值
//                - 编写代码演示数组操作常见的异常----数组下标越界


        int[] array= new int[10];
        System.out.println(array.length);

        int[] array2= new int[2];
        array2[0]=100;
        array2[1]=100;
        System.out.println(array2[array2.length-1]);
//        array2[3]=100;


//        数组小代码练习：遍历
//                - 定义数组，包含10个元素，遍历数组，给每个元素赋值为0到99之间的随机数，输出每个元素的值

        int[] tens= new int[10];
        for (int i = 0; i < tens.length; i++) {
            tens[i]=(int)(Math.random()*100+1);
            System.out.println(tens[i]);
        }



    }
}
