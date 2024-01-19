public class Test3WeekdaySwitchCase {
    public static void main(String[] args) {
        int x=18;
        WeekdaySwitchCase(x);
    }
    public static void WeekdaySwitchCase(int x)
    {
        switch (x){
            case 0: {
                System.out.println("Saturday");
                break;
            }
            case 1: {
                System.out.println("Sunday");
                break;
            }
            case 2:{
                System.out.println("Monday");
                break;
            }
            case 3:{
                System.out.println("Tuesday");
                break;
            }
            case 4:{
                System.out.println("Wednesday");
                break;
            }
            case 5:{
                System.out.println("Thursday");
                break;
            }
            case 6:{
                System.out.println("Friday");
                break;
            }
            default:{
                System.out.println("number is incorrect");
            }
        }
    }
}
