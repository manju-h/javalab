package collections;
import java.util.*;

 public class HashMapExample {
    public static void main(String args[]) {
        
    // Declaring a HashMap of Integer keys and String values
    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
    hashmap.put(1, "Value1");
    hashmap.put(2, "Value2");
    hashmap.put(3, "Value3");
    hashmap.put(4, "Value4");
    hashmap.put(5, "Value5");
    System.out.println("HashMap contains: "+hashmap);
     /* Get values based on key*/
    String var= hashmap.get(2);
    System.out.println("Value at key 2 is: "+var);

    /* Remove values based on key*/
    hashmap.remove(3);
    
    System.out.println("Map keys and values after removal:");
    Set set = hashmap.entrySet();
    Iterator it = set.iterator();
    while(it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        System.out.print("Key is: "+pair.getKey() + " and Value is: ");
        System.out.println(pair.getValue());
    }
  }
}