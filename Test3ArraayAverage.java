public class Test3ArraayAverage {
    public static void main(String[] args) {
        int[] numbers={1,5,6};
        Average(numbers);
    }
    public static void Average(int[] numbers){
        int result=0;
        for (int i=0;i<numbers.length;i++){
            result+=numbers[i];
        }
        result=result/numbers.length;
        System.out.println(result);
    }
}
