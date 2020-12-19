package sample;

import sample.model.Car;

import java.util.List;

public class CarMaker {
    public int getCar (List<Car> cars){
        int totalCar = 0;
        for (Car c: cars){
            totalCar += c.getNumOfCars();
        }
        return totalCar;
    }

}
