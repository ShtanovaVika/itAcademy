package homework4;

public abstract class Car {
    private String mark;
    private String model;
    private int yearOfIssue;
    private int volumeOfFuelTank; //объем топл бака

    public Car(String mark, String model, int yearOfIssue, int volumeOfFuelTank) {
        this.mark = mark;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.volumeOfFuelTank = volumeOfFuelTank;
    }

    @Override
    public int hashCode() {
        int result;
        result = mark != null ? mark.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + yearOfIssue;
        result = 31 * result + volumeOfFuelTank;
        return result;
    }

    @Override
    public String toString() {
        return "mark: " + mark +
                ", model: " + model +
                ", year of issue: " + yearOfIssue +
                ", volume of fuel tank: " + volumeOfFuelTank;
    }
}