package day04;

public class WhileDemo {
    public static void main(String[] args) {
        int num = 0 ;
        while (num<5){
            System.out.println("halo world");
            num++;
        }

        int  factor = 1;
        int product=1;
        while (factor<=9){
            while (product<=9){
                System.out.print(factor+" X "+product+" = "+factor*product+"\t");
                product++;
            }
            System.out.println();
            factor++;
            product=factor;
        }

        factor=1;
        while (factor<=9){
            product=1;
            while (product<=factor){
                System.out.print(factor+" X "+product+" = "+factor*product+"\t");
                product++;
            }
            System.out.println();
            factor+=1;
        }


    }
}
