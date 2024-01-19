public class Test3Factorial {
    public static void main(String[] args) {
        int number=4;
        //4*3*2*1=24
        Factorial(number);
    }
    public static void Factorial(int number)
    {
        int result=1;
        while (number!=1){
             result=result*number;
             number--;
        }
        System.out.println(result);

    }
}
