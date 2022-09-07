package day06;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {


        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*100+1);
            System.out.println(arr[i]);
        }

        Arrays.sort(arr);

        System.out.println("排序后");
        for (int i = 0; i < arr.length ;i++) {
            System.out.println(arr[i]);
        }

        System.out.println("倒序排序");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.println(arr[i]);
        }








        /*
        int[] arr = new int[6];
        int[] arr2= new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*100+1);
        }

        System.arraycopy(arr,0,arr2,0,arr.length);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr[i]+":"+arr2[i]);
        }

        int[] arr3 = new int[5];

         */


    }

}
