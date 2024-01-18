public class Test3EvenOROdd {
    public static void main(String[] args) {
        int x = 5;
        compare(x);
    }
    public static void compare(int number) {
        if(number % 2 == 0)
        {
            System.out.println("number is even");
        }
        else
        {
            System.out.println("number is odd");
        }
    }
}
