package colections;

import generics.Car;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CarListMain {
    public static void main(String[] args) {

        List<Car> cars = new LinkedList<Car>();

        cars.add(new Car("Masina1"));
        cars.add(new Car("Masina2"));

        System.out.println(cars);

        cars.add(0,new Car("Masina3"));

        System.out.println(cars);

        Collections.sort(cars);
        System.out.println(cars);

        System.out.println(cars.contains(new Car("Masina1")));

    }
}
