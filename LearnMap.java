import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
        Map<Integer,Integer> numbers = new TreeMap<>();

        numbers.put(23,1);
        numbers.put(11,2);
        numbers.put(90,5);
        numbers.put(43,3);
        numbers.put(87,4);

        System.out.println(numbers);

        for(Map.Entry<Integer,Integer> e: numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        for(Integer key: numbers.keySet()){
            System.out.println(key);
        }







        /*Map<String,Integer> numbers = new HashMap<>();

        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("Four",4);
        numbers.put("Five",5);

        System.out.println(numbers);

        for(Map.Entry<String,Integer> e: numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        for(String key: numbers.keySet()){
            System.out.println(key);
        }*/
    }
}
