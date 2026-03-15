package Java_A2Z.CollectionsInJava;

import java.util.*;

public class ComparatorComparablePriorityQueue{
    public static void main(String[] args){

        //min priority queue example.used to solve problems of min heap
        PriorityQueue<Integer> minPQ =  new PriorityQueue<>();
        minPQ.add(5);
        minPQ.add(2);
        minPQ.add(8);
        minPQ.add(1);

        //print all the values
        minPQ.forEach((Integer val) -> System.out.println(val));// follows level order traversal

        while(!minPQ.isEmpty()){
            int val = minPQ.poll();
            System.out.println("remove from top " + val);
        }



        //max heap
        //max priority queue example.used to solve problems of max heap
        PriorityQueue<Integer> maxPQ =  new PriorityQueue<>((Integer a,Integer b) -> b-a);
        maxPQ.add(5);
        maxPQ.add(2);
        maxPQ.add(8);
        maxPQ.add(1);

        //print all the values
        minPQ.forEach((Integer val) -> System.out.println(val));// follows level order traversal

        while(!maxPQ.isEmpty()){
            int val = maxPQ.poll();
            System.out.println("remove from top " + val);
        }



        //comparator vs comparable
        //both provides a way to sort the collection of objects
        // when we want to do object sorting
        // when the primitive arrays needs to do some sorting in desceding order then we need something.. 
        /*
        we can do that with the help of comparator and comparable
        comparator-> is a functional interface which has abstract method int compare(T obj1,T obj2);
        sorting algo  uses this compare method of Comparator to compare 2 variables and decide whether to swap varaibles or not
        method return 
        o1> o2 == return 1
        o1==o2 == return 0
        01<o2  ==  return -1
         */

        Integer[] arr = {17,3,5,1,10};
        Arrays.sort(arr,(Integer val1,Integer val2) -> val1-val2);// this method is used for comparing in the sorting method

        System.out.println("Sorted in ascending order");
        for(int v:arr){
            System.out.println(v);
        }

        System.out.println("Sorted in descending order");
        Arrays.sort(arr,(Integer val1,Integer val2) -> val2-val1);// this method is used for comparing in the sorting method

        for(int v:arr){
            System.out.println(v);
        }


        //
        Car[] carArray =  new Car[3];
       
        carArray[0] =  new Car("Sedan","DIESEL");
        carArray[1] =  new Car("SUV","PETROL");
        carArray[2] =  new Car("Tesla","CNG");

        // instead of using lambda expressions we can create a separate class implements compaarable
        // public class CarNameComparator implements Comparator<Car>{
        //     @Override
        //     public int compare(Car o1,Car o2){
        //         return o2.carName.compareTo(o1.carName);
        //     }
        // }
        Arrays.sort(carArray,(Car obj1,Car obj2) -> obj2.carType.compareTo(obj1.carType));
        for(Car car: carArray){
            System.out.println(car.carName + ".." + car.carType);
        }



        //comparable(this is an interface)
        /*
        which has abstract method compareTo(T obj1);
         */
        System.out.println("Sorting using comparable");

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("SUV","petrol"));
        carList.add(new Car("Sedan","diesel"));

        Collections.sort(carList);
        for(Car car : carList){
            System.out.println(car.carName + " " + car.carType);
        }

    }


    
}


