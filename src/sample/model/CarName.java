package sample.model;

public enum CarName {
    TOYOTA ("Toyota"), HONDA("Honda"), FORD("Ford");
    private final String name;
    // enum constructor (used by enum only)
    CarName(String name) {
        this.name = name;
    }
    // to output the instance of the enum as a string we use toString method
    @Override
    public String  toString() {
        return name;
    }
}
