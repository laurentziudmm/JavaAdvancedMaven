package generics;

public abstract class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

}