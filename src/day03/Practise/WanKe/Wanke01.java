package day03.Practise.WanKe;

public class Wanke01 {
    public static void main(String[] args) {
        double price = 300;
        if (price>=3000){
            price*=0.5;
        }else if(price>=1000){
            price*=0.7;
        }else if (price>=500){
            price*=0.8;
        }else {
            price*=0.9;
        }
        System.out.println("最终结算金额为：" + price);
    }
}
