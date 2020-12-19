package sample.model;

public class Toyota extends Car {
    int    numberOfSeats;
    String driveTrain;
    String engineType;
    double engineCapacity;

    public Toyota(int numberOfSeats, String driveTrain,
                 String engineType, double engineCapacity) {
        super(CarName.TOYOTA, CarColor.PURPLE,"SUV","LI",10);
        this.numberOfSeats = numberOfSeats;
        this.driveTrain = driveTrain;
        this.engineType = engineType;
        this.engineCapacity = engineCapacity;
    }
}
