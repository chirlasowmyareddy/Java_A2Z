package Java_A2Z.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Iterable {
    public static void main(String[] args){

        List<Integer> values  = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);

        System.out.println("Iterating the value using iterator method");
        Iterator<Integer> valuesIterator = values.iterator();
        while(valuesIterator.hasNext()){
            int val  = valuesIterator.next();
            System.out.println(val);
            if(val== 3){
                valuesIterator.remove();
            }
        }

        System.out.println("Iterating values using for-each loop");
        for(int val:values){
            System.out.println(val);
        }

        System.out.println("Iterating using for-each method");
        values.forEach((Integer val)->System.out.println(val));
        
    }
    
}

//  iterator is present in Iteratable
/*
    Has methods like 
    hasNext()
    next()
    remove()
*/
