import java.util.HashMap;
import java.util.Map;

public class CustomerHashMap {
   public static void main(String[] args) {
    
    Map<Integer, String> customerDetails = new HashMap<>();
    customerDetails.put(101, "Alice");
    customerDetails.put(102, "Bob");  
    customerDetails.put(103, "Charlie");
    customerDetails.put(104, "Diana");
    customerDetails.put(105, "Ethan");

System.out.println("Id of Customers "+ customerDetails.keySet());
System.out.println("Names of Customers "+ customerDetails.values());
System.out.println("Customer Details "+ customerDetails.entrySet());

System.out.println("cUSTOMER dETAILS OF 103"+ customerDetails.get(103));
customerDetails.remove(102);
System.out.println("Afterremoving details "+ customerDetails);
customerDetails.put(105, "Vijay Krishna ");
System.out.println("After updating details "+ customerDetails);

   } 
}