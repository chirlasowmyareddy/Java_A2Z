package Java_A2Z.CollectionsInJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//it represent the group of objects.Its an interface which provides methods to work on group of objects
/*
    isEmpty(),contains(),add(),..etc
 */
public class Collections1 {

    public static void main(String[] args){
        List<Integer> values  = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        
        //size
        System.out.println(values.size());

        //isEmpty
        System.out.println(values.isEmpty());

        //contains
        System.out.println(values.contains(0));

        //add
        values.add(0);

        //removes using index
        System.out.println(values.remove(1));

        //removes using object.removes the first occurence of the value
        values.remove(Integer.valueOf(0));
        System.out.println(values.contains(0));

        Stack<Integer> stackValues  =  new Stack<>();
        stackValues.add(6);
        stackValues.add(7);
        stackValues.add(8);

        //addAll
        values.addAll(stackValues);

        //containsAll
        System.out.println(values.containsAll(stackValues));

        values.remove(Integer.valueOf(7));
        System.out.println(values.contains(stackValues));

        //removeAll
        values.removeAll(stackValues);
        System.out.println(values.contains(8));
       
        //clear
        values.clear();
        System.out.println(values.isEmpty());

        



    }
    
}


