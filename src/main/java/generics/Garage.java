package generics;

//< T > pentru a face clasa generica
// T de la tipuri(orice litera)
public class Garage <T extends Vehicle> {
    //limitam garajul doar pentru vehicule

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
