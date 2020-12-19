package sample;

import sample.model.Car;
import sample.model.Ford;
import sample.model.Honda;
import sample.model.Toyota;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Honda());
        cars.add(new Honda());
        cars.add(new Honda());
        cars.add(new Honda());
        cars.add(new Toyota(5,"Front Wheel",
                "Inline Four cylinder",2.5));
        cars.add(new Ford(4,"Four Wheel",
                "V8",3.5,false));
        cars.add(new Ford(5,"Front Wheel",
                "Inline Four cylinder",2.5,false));
        cars.add(new Ford(5,"Front Wheel",
                "Inline Four cylinder",2.5,false));
        cars.add(new Toyota(5,"Front Wheel",
                "Inline Four cylinder",2.5));
        cars.add(new Toyota(5,"Front Wheel",
                "Inline Four cylinder",2.5));
        cars.add(new Toyota(5,"Front Wheel",
                "Inline Four cylinder",2.5));

        var makeCar = new CarMaker();

        int totalCar = makeCar.getCar(cars);
        System.out.println("We have made a total of " + totalCar + " cars.");
    }

}