import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PracticeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer,String> data = new LinkedHashMap<>();

        System.out.print("Enter the number of KV pairs you want to enter: ");
        int num = sc.nextInt();

        for(int i = 0; i < num;i++){
            System.out.println("Enter the number key");
            int key = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the string value");
            String val = sc.nextLine();
            data.put(key,val);
        }
        System.out.println("Your map is: "+data);

        for(Integer key: data.keySet()){
            String val = data.get(key);
            System.out.println(key+" has the value of -> "+val);
        }
    }
}
