
package session7generic;
import java.util.HashMap;
import java.util.Map;
public class Test7ExerciseCountry {
    public int Code;
    public String name;
    public int populationCount;

    public Test7ExerciseCountry(int code, String name, int populationCount) {
        this.Code = code;
        this.name = name;
        this.populationCount = populationCount;
    }

    @Override
    public String toString() {
        return "{ Code=" + Code +
                ", contryName='" + name + '\'' +
                ", populationCount=" + populationCount +
                "}\n";
    }
    public static void main(String[] args) {
        Test7ExerciseCountry country1 = new Test7ExerciseCountry(111, "Iran", 83000000);
        Test7ExerciseCountry country2 = new Test7ExerciseCountry(222, "Germany", 83200000);
        Test7ExerciseCountry country3 = new Test7ExerciseCountry(333, "France", 67750000);
        Test7ExerciseCountry country4 = new Test7ExerciseCountry(444, "Netherland", 17500000);

        Map<Integer, Test7ExerciseCountry> myCountry = new HashMap<>();
        myCountry.put(1, country1);
        myCountry.put(2, country2);
        myCountry.put(3, country3);
        myCountry.put(4, country4);
        System.out.println(myCountry.values().toString());
//        System.out.println("code 1 is exist? "+myCountry.containsKey(1));
    }


}

