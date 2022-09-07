package day05.Practise;

public class ExtendPractise03 {
    public static void main(String[] args) {
//        利用for循环计算：打印字符*组成的等腰三角形，输出结果如下所示：

        int row=6;
        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < row-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i*2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
