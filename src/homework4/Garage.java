package homework4;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    private int countPlace;
    private int countCars = 0;
    private Map<Car, Integer> carsList;

    public Garage() {
        carsList = new HashMap<>();
        countPlace = 0;
        countCars = 0;
    }

    public void setCount(int count) {
        this.countPlace = count;
    }

    public void parking(Car car) {
        if (countPlace == countCars) {
            System.out.println("Sorry! No place for " + car);
            return;
        }
        for (int i = 0; i <= carsList.size(); i++) {
            if (!carsList.containsKey(car)) {
                carsList.put(car, 0);
            }
            carsList.put(car, carsList.get(car) + 1);
            countCars++;
            return;
        }
    }

    public void leave(Car car) {
        if (!(carsList.get(car) == 1)) {
            Integer i = carsList.get(car) - 1;
            carsList.put(car, i);
        } else
            carsList.remove(car);
        countCars--;
    }

    public Integer getCountCars(Car car) {
        return carsList.get(car);
    }

    public void print() {
        System.out.println("Garage \n" + "Full " + countCars + " of " + countPlace + "\n");
        for (Map.Entry<Car, Integer> entry : carsList.entrySet()) {
            System.out.println(entry.getKey() + "Number: " + entry.getValue() + "\n");
        }
    }
}