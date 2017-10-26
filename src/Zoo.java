public class Zoo {
    public static void main(String[] args) {
        // memory is first allocated for the dog variable
        // then a new animal is created in memory
        // the dog variable then points to the new Animal object in memory
        Animal dog = new Animal("Doggity", "male", 4, true);
        dog.growl();
        Animal cat = new Animal("Catty", "female", 4, true);
        cat.meow();
        Animal wolf = new Animal("Wolfy", "male", 3, false);
        wolf.growl();
        Bird birdy = new Bird();
        birdy.fly();
        birdy.speak();
        Fish fishy = new Fish();
        fishy.tail = true;
        fishy.swim();
        fishy.speak();
        if (fishy.tail) {
            System.out.println("I have a tail!");
        }
    }
}
