package sample;

import sample.model.Car;
import sample.model.Ford;
import sample.model.Honda;
import sample.model.Toyota;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(); //This list contain all the cars that will be made
                                            //
                                            // the data type of the members of the list is Car Class
        cars.add(new Honda()); //Adding Honda to cars List
        cars.add(new Honda());
        cars.add(new Toyota(5,"Front Wheel",
                "Inline Four cylinder",2.5));
        cars.add(new Toyota(5,"Front Wheel",
                "Inline Four cylinder",2.5));
        cars.add(new Ford(4,"Four Wheel",
                "V8",3.5,false));
        cars.add(new Ford(5,"Front Wheel",
                "Inline Four cylinder",2.5,false));

        var totalCars = new CarCollector();
        var totalCar = totalCars.getCar(cars);

        System.out.println("\nWe have made a total of " + totalCar + " cars.\n");
    }

}