/*the goal is to create encapsulated automotive (Car)
each instance of teh car class represent a single car
so we will need to represent like name, brand, color type so on..
this values are defined as field of the class
*/
package sample.model;
public abstract class Car {
    public CarName name; // The CarName data type was implemented from enum
    public CarColor color; // The CarColor data type was implemented from enum
    public String type;
    public String trim;
    public int numOfCars;

    public Car(CarName name, CarColor color, String type, String trim, int numOfCars) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.trim = trim;
        this.numOfCars = numOfCars;
    }

    public int getNumOfCars() {

        System.out.println("\nMaking car ...\n");
        System.out.println("A total of " + numOfCars + " " + getColor() +" " + getName() +" "
                + getType() + " " + getTrim() + " cars has been made.");
        return numOfCars;
    }
    public CarName getName() { return name; }
    public CarColor getColor() { return color; }
    public String getType() { return type; }
    public String getTrim() { return trim; }
}
