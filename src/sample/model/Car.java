/*the goal is to create encapsulated automotive (Car)
each instance of teh car class represent a single car
so we will need to represent like name, brand, color type so on..
this values are defined as field of the class
*/
package sample.model;
public abstract class Car {
    private final CarName name;
    private final CarColor color;
    private final String type;
    private final String trim;
    private final int numOfCars;

    public Car(CarName name, CarColor color, String type, String trim, int numOfCars) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.trim = trim;
        this.numOfCars = numOfCars;
    }

    public int getNumOfCars() {

        System.out.println("Making car ...");
        System.out.println("A total of " +
                numOfCars + " " +
                color +" "+ name +" "+ type + " " + trim + " cars has been made.");
        return numOfCars;
    }
    /*public void setNumOfCars(int numOfCars) { this.numOfCars = numOfCars; }

    public CarName getName() { return name; }

    public void setName(CarName name) { this.name = name; }

    public CarColor getColor() { return color; }

    public void setColor(CarColor color) { this.color = color; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getTrim() { return trim; }

    public void setTrim(String trim) { this.trim = trim; }

     */

}
