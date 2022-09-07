package day05;

public class ForDemo {
    public static void main(String[] args) {
        for(int num=1;num<=9;num++){
            if (num==5){
                break;
            }
            System.out.println(num+"*9="+num*9);
        }
        for(int num=1;num<=9;num+=2){
            System.out.println(num+"*9="+num*9);
        }
        for (int num =9;num>=1;num--){
            if (num%3==0){
                continue;
            }
            System.out.println(num+"*9="+num*9);
        }

        for (int times = 0; times < 5; times++) {
            System.out.println("酷酷的");
        }
        System.out.println("gogo");
    }
}
