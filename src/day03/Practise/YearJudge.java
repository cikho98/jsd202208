package day03.Practise;

public class YearJudge {


    public boolean yearsJudge(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
}
