package session7generic;

import java.util.ArrayList;
import java.util.List;
public class Test7ExerciseGenerics {
    public static void sumTotal(List<Integer> number1, List<Integer> number2) {
        List<Integer> sum = new ArrayList<>();
        int length = 0;
        if (number1.size() > number2.size()) {
            length = number2.size();
        }
        for (int i = 0; i < length; i++) {
            if (number1.get(i) != null && number2.get(i) != null) {
                sum.add(number1.get(i) + number2.get(i));
                System.out.println(sum);
            } else {
                System.out.println(sum);
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> number1 = new ArrayList<>();
        List<Integer> number2 = new ArrayList<>();
        number1.add(1);
        number1.add(2);
        number1.add(3);
        number1.add(4);
        number1.add(5);

        number2.add(100);
        number2.add(200);
        number2.add(300);
        sumTotal(number1, number2);
    }
}


