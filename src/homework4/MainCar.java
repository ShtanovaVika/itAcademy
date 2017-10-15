package homework4;

public class MainCar {
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.setCount(5);
        Auto auto1 = new Auto("BMV", "X5", 2014, 85, 4);
        garage.parking(auto1);
        Auto auto2 = new Auto("BMV", "X5", 2014, 85, 4);
        garage.parking(auto2);
        Bus bus = new Bus("Neoplan", "N116", 2000, 570, 51);
        garage.parking(bus);
        SportCar sportCar = new SportCar("Dodge", "Charger SRT Hellcat", 2015, 70, 314, 3.7);
        garage.parking(sportCar);
        CargoAuto cargoAuto = new CargoAuto("YueJin", "1080", 2007, 13000, 5);
        garage.parking(cargoAuto);
        garage.print();
        garage.leave(auto2);
        System.out.println(auto2 + " left th parking");
        garage.print();
        System.out.println("Number " + bus + garage.getCountCars(bus));
    }
}