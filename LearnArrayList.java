import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LearnArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        System.out.print("Enter the number of elements you want to enter in your arraylist: ");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int b = sc.nextInt();
            list.add(b);
        }

        System.out.println("Your created list is: " + list);
        System.out.println("The number of elements in the list is: " + list.size());

        // --- Operations added based on your previous practice ---

        System.out.print("Enter the number to check if it's in the list: ");
        int i = sc.nextInt();
        if (list.contains(i)) {
            System.out.println("The element is in the list.");
        } else {
            System.out.println("The element is not in the list.");
        }

        System.out.print("Enter the number you want to add: ");
        int c = sc.nextInt();
        System.out.print("Enter the index (0 to " + a + ") to add it at: ");
        int d = sc.nextInt();
        list.add(d, c);
        System.out.println("Your updated list after adding: " + list);

        // --- New operations added ---

        // 1. Adding all elements from another list
        List<Integer> newList = new ArrayList<>();
        newList.add(99);
        newList.add(100);
        list.addAll(newList);
        System.out.println("List after adding all elements from newList: " + list);

        // 2. Setting a value at a specific index
        System.out.print("Enter the index to update (0 to " + (list.size() - 1) + "): ");
        int setIndex = sc.nextInt();
        System.out.print("Enter the new value: ");
        int setValue = sc.nextInt();
        list.set(setIndex, setValue);
        System.out.println("List after setting a new value at index " + setIndex + ": " + list);

        // 3. Getting a value at a specific index
        System.out.print("Enter the index to get the value from (0 to " + (list.size() - 1) + "): ");
        int getIndex = sc.nextInt();
        System.out.println("The element at index " + getIndex + " is: " + list.get(getIndex));

        // 4. Removing an element
        System.out.print("Enter the index to remove (0 to " + (list.size() - 1) + "): ");
        int removeIndex = sc.nextInt();
        list.remove(removeIndex);
        System.out.println("List after removing element at index " + removeIndex + ": " + list);

        // 5. Clearing the list
        list.clear();
        System.out.println("List after clearing all elements: " + list);
        System.out.println("Is the list empty? " + list.isEmpty());

        sc.close();

    }
}






//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        System.out.println(list);
//
//        list.add(4);
//        System.out.println(list);
//
//        list.add(1,50);
//        System.out.println(list);
//
//        List<Integer> newList = new ArrayList<>();
//        newList.add(250);
//        newList.add(221);
//
//        list.addAll(newList);
//        System.out.println(list);
//
//        System.out.println(list.get(1));
//        list.remove(1);
//        System.out.println(list);
//        System.out.println(list.get(1));
//        for(int e:list){
//        System.out.println(e);


