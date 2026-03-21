package Java_A2Z.CollectionsInJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTreeMap {

    /*
    LinkedHashMap ->Helps in maintaining Insertion Order or Helps in maintain access order
    Similar to HashMap,but also uses Double Linked List
     */

    public static void main(String[] args){

        System.out.println("-----------below is LinkedHashMap output------------");
        System.out.println("Maintain Insertion Order");
        Map<Integer,String> mpp = new LinkedHashMap<>();

        mpp.put(1,"A");
        mpp.put(21,"B");
        mpp.put(23,"C");
        mpp.put(141,"D");
        mpp.put(25,"E");

        mpp.forEach((Integer key,String val) -> System.out.println(key + " : "+val));

        System.out.println("-----------below is normal hash map output-----------");

        Map<Integer,String> mpp2 = new HashMap<>();

        mpp2.put(1,"A");
        mpp2.put(21,"B");
        mpp2.put(23,"C");
        mpp2.put(141,"D");
        mpp2.put(25,"E");

        mpp2.forEach((Integer key,String val) -> System.out.println(key + " : "+val));

        System.out.println("-----------below is LinkedHashMap output------------");
        System.out.println("Maintain Access Order");
        System.out.println("Order is low frequnrty used to high frequently");
        Map<Integer,String> mpp3 = new LinkedHashMap<>(16,.75F,true);

        mpp3.put(1,"A");
        mpp3.put(21,"B");
        mpp3.put(23,"C");
        mpp3.put(141,"D");
        mpp3.put(25,"E");

        //accessing some data
        mpp3.get(23);

        mpp3.forEach((Integer key,String val) -> System.out.println(key + " : "+val));
        
    }
    
}
