public class Zoo {
    public static void main(String[] args) {
        Animal dog = new Animal("Doggity", "male", 4, true);
        dog.growl();
        Animal cat = new Animal("Catty", "female", 4, true);
        cat.meow();
        Animal wolf = new Animal("Wolfy", "male", 3, false);
        wolf.growl();
    }
}
