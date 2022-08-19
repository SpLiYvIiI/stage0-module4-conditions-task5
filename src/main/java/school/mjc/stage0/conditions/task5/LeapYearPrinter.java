package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int helper = ((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0) ? 1 : 0;
        switch (helper){
            case 1: {
                System.out.println("leap");
                break;
            }
            default:{
                System.out.println("not leap");
            }
        }
    }
}
