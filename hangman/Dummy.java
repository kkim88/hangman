package hangman;

abstract public class Dummy {

    // properties

    String name;
    int age;
    String crime;

    // constructor

    Dummy(String name, int age, String crime) {
        this.name = name;
        this.age = age;
        this.crime = crime;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    String getCrime() {
        return this.crime;
    }

    void biography() {
        System.out.println("A summary of " + this.name + "'s crimes");
    }
}
