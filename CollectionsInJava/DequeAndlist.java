package Java_A2Z.CollectionsInJava;

import java.lang.Integer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class DequeAndlist {

    public static void main(String[] args){

        //-------------------Deque-------------------------
        // deque
        /*
            * addition and removal can be done on both sides of the queue
            * queue and deque are interfaces and priorityQueue and ArrayDeque are concrete classes
            * both priority queue and ArrayDeque are not thread safe and null elements are not allowed in both of these
            * thread safe version of priorityQueue is priorityBlockingQueue
            * and for deque it would be ConcurrentLinkedDeque


        */

        ArrayDeque<Integer> arrDequeAsQueue = new ArrayDeque<>();
        //insertion 
        arrDequeAsQueue.addLast(1);
        arrDequeAsQueue.addLast(5);
        arrDequeAsQueue.addLast(10);

        //deletion
        int element = arrDequeAsQueue.removeFirst();
        System.out.println(element);

        //LIFO (last in first out
        ArrayDeque<Integer> arrDequeAsStack = new ArrayDeque<>();
        //insertion 
        arrDequeAsStack.addFirst(1);
        arrDequeAsStack.addFirst(5);
        arrDequeAsStack.addFirst(10);

        //deletion
        int removeElement = arrDequeAsStack.removeFirst();
        System.out.println(removeElement);




        //-----------List-----------------
        /*
            List is an ordered collection of an object,in which duplicate values can be stored
            in list only user can decide where to insert or access using index(starting from 0)
            in queue only we can do operations eithr on the first or last of the queue
            whereas in list data can be inserted,removed or accessed from any where.
         */

         //arrayList,vector,stack,linkedlist are the concrete classes of the list interface

        List<Integer> list = new ArrayList<>();

        //add(int index,Element e)
        list.add(0,100);
        list.add(1,200);
        list.add(2,300);

        //addAll(int index,Collection c)
        List<Integer> list2 = new ArrayList<>();

        list2.add(0,400);
        list2.add(1,500);
        list2.add(2,600);

        list.addAll(2,list2);
        list.forEach((Integer val) -> System.out.println(val));

        //replaceAll(UnaryOperator op)
        list.replaceAll((Integer val)-> -1* val);
        System.out.println("after replacing all");
        list.forEach((Integer val) -> System.out.println(val));

        //sort(Comparator c)
        list.sort((Integer val1,Integer val2) -> val1-val2);
        System.out.println("after sorting in increasing order");
        list.forEach((Integer val) -> System.out.println(val));

        //get(int index)
        System.out.println("value present at index 2 is "+ list.get(2));

        //set(int index,Element e)
        list.set(2,-4000);
        System.out.println("after set method: ");
        list.forEach((Integer val) -> System.out.println(val));

        //remove(int index)
        list.remove(2);
        System.out.println("After removing the element ");
        list.forEach((Integer val) -> System.out.println(val));

        //indexOf(Object o)
        System.out.println("index of -200 Integer object is "+ list.indexOf(-200));


        //traversing in forward direction
        //come back to this later**** can be done in backward direction as well
        ListIterator<Integer> listIterator2 = list.listIterator();
        while(listIterator2.hasNext()){
            int val  = listIterator2.next();
            System.out.println("traversing forward "+ val + " next index " + listIterator2.nextIndex() + " previous index "+ listIterator2.previousIndex());
            if(val == -200){
                listIterator2.add(-100);
            }
        }
        list.forEach((Integer val) -> System.out.println(val));

        List<Integer>subList  = list.subList(1,4);
        subList.forEach((Integer val) -> System.out.println(val));

        subList.add(-900);
        list.forEach((Integer val) -> System.out.println(val));


        //-------------------Linked List-----------------------

        LinkedList<Integer> list3 = new LinkedList<>();

        //using deque functionality
        list3.addLast(200);
        list3.addLast(300);
        list3.addLast(400);
        list3.addFirst(100);

        System.out.println(list3.getFirst());

        // using list functionality

        LinkedList<Integer> list4 = new LinkedList<>();
        list4.add(0,100);
        list4.add(1,300);
        list4.add(2,400);
        list4.add(1,200);
        System.out.println(list4.get(1) +" "+ list4.get(2));

        /*
        ArrayList is not thread safe but vector is thread safe
        LinkedList is alsonot thread safe

        Deque is not thread safe but same functionality can be done using stack which is thread safe
         */
        




        
    }
}
