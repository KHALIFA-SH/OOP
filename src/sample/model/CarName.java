package sample.model;
// Enumeration is where we make lists of possible values we can use for any particular variable
// It is similar to constants in java but we can do more restriction with it like sequence...

public enum CarName {
    TOYOTA ("Toyota"), HONDA("Honda"), FORD("Ford");//TOYOTA,HONDA and FORD are identifiers here
    private final String name; //("Toyota"),("Honda") and ("Ford") are literal strings that translates the enum identifiers
    CarName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    // the default toString method of enum simply translates the identifier
    // to output the instance of the enum as a string we use toString method
    // enum constructor (used by enum only)
}