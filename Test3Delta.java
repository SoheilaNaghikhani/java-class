public class Test3Delta {
    public static void main(String[] args) {
        int x = 1;
        int equation=3*x*x+6*x+2;
        int a=3;
        int b=6;
        int c=2;
        int result=Delta(a,b,c);
        System.out.println(result);
    }
    public static int Delta(int a,int b, int c){
        return (b*b-4*a*c);
    }
}
