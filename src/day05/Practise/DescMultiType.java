package day05.Practise;


//MultiType九九乘法表：输出九九乘法表

public class DescMultiType {
    public static void main(String[] args) {
        int num = 9;
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "X" + i + "=" + j * i + "\t");
            }
            System.out.println();

        }
    }
}