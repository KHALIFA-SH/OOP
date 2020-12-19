package sample;

import sample.model.Car;

import java.util.List;

public class CarCollector {
    public int getCar (List<Car> cars){
        var totalCar = 0;
        for (Car c: cars){
            totalCar += c.getNumOfCars();
        }
        return totalCar;
    }
}
