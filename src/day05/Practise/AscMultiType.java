package day05.Practise;

public class AscMultiType {
    public static void main(String[] args) {
        int num = 9;
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j + "X" + i + "=" + j * i + "\t");            }
            System.out.println();
        }
    }
}
