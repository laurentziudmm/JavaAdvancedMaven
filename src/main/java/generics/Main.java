package generics;

public class Main {
    public static void main(String[] args) {

        Garage<Car> garage = new Garage(new Car[5]);
        Car car1 = new Car("Logan");
        garage.addVehicle(car1);
        garage.showGarage();

    }
}
