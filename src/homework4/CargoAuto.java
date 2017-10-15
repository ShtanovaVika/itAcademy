package homework4;

public class CargoAuto extends Car {
    private double capacity;

    public CargoAuto(String mark, String model, int yearOfIssue, int volumeOfFuelTank, double capacity) {
        super(mark, model, yearOfIssue, volumeOfFuelTank);
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CargoAuto cargoAuto = (CargoAuto) o;
        return Double.compare(cargoAuto.capacity, capacity) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(capacity);
        return 31 * super.hashCode() + (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "\nCargo auto\n" + super.toString() +
                ", capacity " + capacity + "\n";
    }
}