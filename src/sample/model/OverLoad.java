package sample.model;

public class OverLoad {
    public static void main(String[] args) {
        var add = add(1,2,3,4,5,6);
        System.out.println(add);
    }

    static double add(double ... values) {
        var result = 0;
        for (var value: values){
            result += value;
        }
        return result;
    }
}