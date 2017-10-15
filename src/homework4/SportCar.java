package homework4;

public class SportCar extends Car {

    private int maxSpeed;
    private double accelerationTo100KmH;

    public SportCar(String mark, String model, int yearOfIssue, int volumeOfFuelTank, int maxSpeed, double accelerationTo100KmH) {
        super(mark, model, yearOfIssue, volumeOfFuelTank);
        this.maxSpeed = maxSpeed;
        this.accelerationTo100KmH = accelerationTo100KmH;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportCar sportCar = (SportCar) o;
        if (maxSpeed != sportCar.maxSpeed) return false;
        return Double.compare(sportCar.accelerationTo100KmH, accelerationTo100KmH) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp = Double.doubleToLongBits(accelerationTo100KmH);
        result = 31 * super.hashCode() + maxSpeed;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "SportCar " + super.toString() +
                ", maxSpeed: " + maxSpeed +
                ", accelerationTo100KmH: " + accelerationTo100KmH + "\n";
    }
}