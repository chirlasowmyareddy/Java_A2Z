package Java_A2Z.CollectionsInJava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapInternalWorking {

    //map is not a part of collection as it is a key value pair where collection is only value.

    // load factor makes the refactoring helps avoid more collisions
    //triefy threshold makes the linked list as a balanced binary search tree(may be red-black tree)
    // so searching capacity of o(n) before with linked list will be changed to the worst complexity o(log n)

    public static void main(String[] args)
    {
            //k,V
        Map<Integer, String> mpp = new HashMap<>();//default 16
        mpp.put(null,"TEST");
        mpp.put(0,null);
        mpp.put(1,"A");
        mpp.put(2,"B");

        //compute if present
        mpp.putIfAbsent(null,"test");// if key is not exiting or value is only null then only this happens
        mpp.putIfAbsent(0,"ZERO");
        mpp.putIfAbsent(3, "C");

        for(Map.Entry<Integer,String> entryMap : mpp.entrySet()){
            Integer key = entryMap.getKey();
            String value = entryMap.getValue();

            System.out.println("Key: "+ key + " Value: "+value);
        }

        //isEmpty
        System.out.println("isEmpty(): "+mpp.isEmpty());

        //size
        System.out.println("size: "+mpp.size());

        //containsKey
        System.out.println("containsKey(3): "+mpp.containsKey(3));


        //get(key)
        System.out.println("get(1): "+mpp.get(1));

        //getOrDefault(key)
        System.out.println("get(9): "+mpp.getOrDefault(9, "default value"));

        //remove(key)
        System.out.println("remove(null): "+mpp.remove(null));

        for(Map.Entry<Integer,String> entryMap : mpp.entrySet()){
            Integer key = entryMap.getKey();
            String value = entryMap.getValue();

            System.out.println("Key: "+ key + " Value: "+value);
        }

        //keySet()
        for(Integer key:mpp.keySet()){
            System.out.println("key: "+key);
        }

        //values()
        Collection<String> values = mpp.values();
        for(String value:values){
            System.out.println("Value: "+ value);
        }


    }

    
}
