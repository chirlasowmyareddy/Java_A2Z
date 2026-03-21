package Java_A2Z.CollectionsInJava;

import java.util.HashSet;
import java.util.Set;

public class SetCollections6 {

    public static void main(String[] args){
        Set<Integer> set1 = new HashSet<>();

        set1.add(12);
        set1.add(11);
        set1.add(33);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(11);
        set2.add(9);
        set2.add(88);
        set2.add(10);
        set2.add(5);
        set2.add(12);

        //UNION of 2 sets
        set1.addAll(set2);
        System.out.println("After union ");
        set1.forEach((Integer val)-> System.out.println(val));

        //Interaction of 2 sets
        set1 = new HashSet<>();
        set1.add(12);
        set1.add(11);
        set1.add(33);
        set1.add(4);

        set2 =  new HashSet<>();
        set2.add(11);
        set2.add(9);
        set2.add(88);
        set2.add(10);
        set2.add(5);
        set2.add(12);

        set1.retainAll(set2);
        System.out.println("After Intersection ");
        set1.forEach((Integer val) -> System.out.println(val));

        //DIFFERENCE of 2 sets

        set1 = new HashSet<>();
        set1.add(12);
        set1.add(11);
        set1.add(33);
        set1.add(4);

        set2 =  new HashSet<>();
        set2.add(11);
        set2.add(9);
        set2.add(88);
        set2.add(10);
        set2.add(5);
        set2.add(12);

        set1.removeAll(set2);
        System.out.println("After Difference: ");
        set1.forEach((Integer val)-> System.out.println(val));

        /*
        Linked HashSet maintains only insertion order and not access order bcoz the access is not provided or maintained

         */
    }
    
}
