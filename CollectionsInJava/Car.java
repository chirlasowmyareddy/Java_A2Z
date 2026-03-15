package Java_A2Z.CollectionsInJava;

public class Car implements Comparable<Car>{
    String carType;
    String carName;

    Car(String name,String type){
        this.carName = name;
        this.carType = type;
    }

    @Override
    public int compareTo(Car o2) {
        return this.carType.compareTo(o2.carType);
        //descending
        // return o2.carType.compareTo(this.carType);
    }
}
