public class Test3FactorialWithForLoops {
    public static void main(String[] args) {
        int number=4;
        //4*3*2*1=24
        Factorial(number);
    }
    public static void Factorial(int number)
    {
        int result=1;
        for (int i=1;i<=number;i++)
        {
            result=result*i;
        }
        System.out.println(result);
    }
}
