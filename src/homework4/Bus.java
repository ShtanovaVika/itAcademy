package homework4;

public class Bus extends Car {
    private int countPlace;

    public Bus(String mark, String model, int yearOfIssue, int volumeOfFuelTank, int countPlace) {
        super(mark, model, yearOfIssue, volumeOfFuelTank);
        this.countPlace = countPlace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return countPlace == bus.countPlace;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + countPlace;
    }

    @Override
    public String toString() {
        return "\n Bus \n" + super.toString() +
                ", countPlace: " + countPlace + "\n";
    }
}