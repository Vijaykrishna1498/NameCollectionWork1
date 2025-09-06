import java.util.Set;
import java.util.HashSet;

public class BankAccountDetailsHash {

   public static void main(String[] args) {
    
    
    Set<Integer>bank1 = new HashSet<>();
    bank1.add(101);
    bank1.add(102);
    bank1.add(103); 
    bank1.add(104);
    bank1.add(105);
    System.out.println("Bank1 Account Numbers: " + bank1);

    Set<Integer>bank2 = new HashSet<>();
    bank2.add(104);
    bank2.add(105);
    bank2.add(106);
    bank2.add(107);
    bank2.add(108);
    System.out.println("Bank2 Account Numbers: " + bank2);

    //union
    Set<Integer> unioun = new HashSet<>(bank1);
    unioun.addAll(bank2);    
    System.out.println("Union of Bank1 and Bank2: " + unioun);

    Set<Integer> intersection = new HashSet<>(bank1);
    intersection.retainAll(bank2);
    System.out.println("Intersection of Bank1 and Bank2: " + intersection);

    Set<Integer> bank1only = new HashSet<>(bank1);
    bank1only.removeAll(bank2);
    System.out.println("Account numbers only in Bank1: " + bank1only);

    Set<Integer> bank2Only = new HashSet<>(bank2);
    bank2Only.removeAll(bank1);
    System.out.println("Account numbers only in Bank2: " + bank2Only);

   }
}