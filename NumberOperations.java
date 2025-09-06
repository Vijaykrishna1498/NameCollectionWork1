import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class NumberOperations {
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);         
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);
        System.out.println("Initial List1: " + numbers);

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(10);       

        numbers2.add(20);
        numbers2.add(30);
        numbers2.add(40);
        numbers2.add(50);
        System.out.println("Initial List2: " + numbers2);

        Set<Integer> unioun = new HashSet<>(numbers);
        unioun.addAll(numbers2);    
        System.out.println("Unioun "+unioun);

        Set<Integer> intersection = new HashSet<>(numbers);
        intersection.retainAll(numbers2);   
        System.out.println("Intersection" + intersection);

        Set<Integer> differenceAB = new HashSet<>(numbers);
        differenceAB.removeAll(numbers2);
         System.out.println("Diff btwn A-B"+differenceAB);

         Set<Integer> differnceBA = new HashSet<>(numbers2);
         differnceBA.removeAll(numbers);
         System.out.println("Diff btwn B-A"+differnceBA);

    }
    
}
