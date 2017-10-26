public class Animal {
    String name;
    String gender;
    int numberOfLegs;
    boolean tail;

    public Animal() {}

    public Animal(String name, String gender, int numberOfLegs, boolean tail) {
        this.name = name;
        this.gender = gender;
        this.numberOfLegs = numberOfLegs;
        this.tail = tail;
    }

    public void growl() {
        System.out.print("My name is grrrrr " + name + ", ");
        System.out.print("I am " + gender + ", I have " + numberOfLegs + " legs, ");
        String tailMessage = tail ? "and I have a tail!" : "and no tail...";
        System.out.println(tailMessage);
    }

    public void meow() {
        System.out.print("Meow, I am " + name + ", I am " + gender + ", and ");
        String tailMessage = tail ? "oh wow I have a tail!" : "shit...no tail...";
        System.out.println(tailMessage);
    }

    public void speak() {
        System.out.println("I am an animal!");
    }
}
