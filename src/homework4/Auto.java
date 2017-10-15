package homework4;

public class Auto extends Car {
    private int numberOfDoors;

    public Auto(String mark, String model, int yearOfIssue, int volumeOfFuelTank, int numberOfDoors) {
        super(mark, model, yearOfIssue, volumeOfFuelTank);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return numberOfDoors == auto.numberOfDoors;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + numberOfDoors;
    }

    @Override
    public String toString() {
        return "Auto \n" + super.toString() +
                ", numberOfDoors: " + numberOfDoors + "\n";
    }
}