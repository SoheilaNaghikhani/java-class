package session7generic;
import java.util.HashSet;
import java.util.Set;
public class Test7Set {
    public static void main(String[] args) {
        Set<String> mySet=new HashSet<>();
        mySet.add("Pen");
        mySet.add("Book");
        mySet.add("Bag");
        mySet.add("Pen");
        mySet.add("Pencel");
        for (String m:mySet)
        {
            System.out.println(m);
        }

    }
}
