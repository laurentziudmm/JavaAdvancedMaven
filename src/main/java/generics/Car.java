package generics;

public class Car extends Vehicle implements Comparable<Car>{



    public Car(String name) {
        super(name);
    }


    @Override
    public int compareTo(Car o) {
        return this.getName().compareTo(o.getName());
    }
}
