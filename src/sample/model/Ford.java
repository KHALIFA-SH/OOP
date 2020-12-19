package sample.model;

public class Ford extends Car{
    int numberOfSeats;
    String driveTrain;
    String engineType;
    double engineCapacity;
    boolean isTurboCharged;

    public Ford (int numberOfSeats, String driveTrain,
                  String engineType, double engineCapacity, boolean isTurboCharged) {
        super(CarName.FORD, CarColor.GREEN,"Truck","F150",50);
        this.numberOfSeats = numberOfSeats;
        this.driveTrain = driveTrain;
        this.engineType = engineType;
        this.engineCapacity = engineCapacity;
        this.isTurboCharged = isTurboCharged;
    }
}
