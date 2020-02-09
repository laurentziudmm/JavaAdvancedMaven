package generics;

public class Main {
    public static void main(String[] args) {

        Garage<Car> garage = new Garage(new Car[5]);
        Car car1 = new Car("Dacia ");
        garage.addVehicle(car1);
        garage.showGarage();

        Garage<Scuter> scuterGarage = new Garage( new Scuter[5]);
        Scuter scuter1 = new Scuter( "Vespa ");
        scuterGarage.addVehicle(scuter1);
        scuterGarage.showGarage();
    }
}
