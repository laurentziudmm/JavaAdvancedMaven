package generics;

public class Garage <T> {

    private int n ;

    private T[] vehicles;

    public Garage(T[] vehicles) {
        n =0;
        this.vehicles = vehicles;
    }

    public void addVehicle(T vehicle) {
        if ( n < vehicles.length ) {
            vehicles[n] = vehicle;
            n++;
        } else {
            System.out.println("Array is full!!");
        }

    }

    public void showGarage () {
        System.out.print("Garage has : ");

        for (int i = 0; i < n; i++) {
            System.out.println(vehicles[i].toString());
        }

    }

}
