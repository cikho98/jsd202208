package day02.Practise;

public class VarDemo3 {
    public static void main(String[] args) {
//        1声明初始化两个以上的长整型变量
        long long1=10000000000000L,long2=203131241025151l;

//        2声明变量存储几个较大数据的运算，演示：若有可能溢出建议将L设计在第1个数字后。
        long long3 = 20000L*1000000000;
        System.out.println(long3);
    }
}
