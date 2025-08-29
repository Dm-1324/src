import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {

        Set<Student2> studentSet = new HashSet<>();

        studentSet.add(new Student2("Dhruv",21));
        studentSet.add(new Student2("Dv",22));
        studentSet.add(new Student2("D",23));
        studentSet.add(new Student2("v",22));

        System.out.println(studentSet);

//        Set<Integer> set = new TreeSet<>();
//        set.add(63);
//        set.add(110);
//        set.add(2);
//        set.add(85);
//        set.add(4);
//
//        System.out.println(set);
//
//        set.remove(85);
//        System.out.println(set);
//        System.out.println(set.contains(85));
//        System.out.println(set.contains(63));
//
//        System.out.println(set.isEmpty());
//
//        System.out.println(set.size());

        /*Set<Integer> set = new LinkedHashSet<>();

        set.add(63);
        set.add(110);
        set.add(2);
        set.add(85);
        set.add(4);

        System.out.println(set);

        set.remove(85);
        System.out.println(set);
        System.out.println(set.contains(85));
        System.out.println(set.contains(63));

        System.out.println(set.isEmpty());

        System.out.println(set.size());*/



        /*Set<Integer> set = new HashSet<>();

        set.add(63);
        set.add(110);
        set.add(2);
        set.add(85);
        set.add(4);

        System.out.println(set);

        set.remove(85);
        System.out.println(set);
        System.out.println(set.contains(85));
        System.out.println(set.contains(63));

        System.out.println(set.isEmpty());

        System.out.println(set.size());*/

//        set.clear();
//        System.out.println(set.size());
//        System.out.println(set);
    }
}
