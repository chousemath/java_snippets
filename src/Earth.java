public class Earth {
    public static void main(String[] args) {
        Human human = new Human("Bob", 123, 321, "green");
        human.speak();
        human.walk();
        human.eat();
        human.work();
        System.out.println("------");
        Human steve = new Human("Steve", 22, 50, "red");
        steve.speak();
        steve.eat();
        steve.work();
        steve.walk();
    }
}
