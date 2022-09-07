package day05;

public class MultiTable {
    public static void main(String[] args) {
        int num = 9;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "X" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "X" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }

    }
}
