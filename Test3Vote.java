public class Test3Vote {
    public static void main(String[] args) {
        condition(1370);

    }
    public static void condition(int birthday)
    {
        int age=1402-birthday;
        if (age >=18)
        {
            System.out.println("Allowed To Vote");
        }
        else {
            System.out.println("Not Allowed To Vote");
        }
    }
}
