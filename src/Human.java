public class Human {
    String name;
    int age;
    int heightInInches;
    String eyeColor;

    public Human(String name, int age, int heightInInches, String eyeColor) {
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }

    public void speak() {
        System.out.println("Hello my name is " + name);
        System.out.println("Also, my age is " + age);
        System.out.println("Hey, my height in inches is " + heightInInches);
        System.out.println("And finally my eye color is " + eyeColor);
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void walk() {
        System.out.println("Walking...");
    }

    public void work() {
        System.out.println("Working...");
    }
}
