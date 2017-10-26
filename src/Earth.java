public class Earth {
    public static void main(String[] args) {
        // in this case, "human" is an instance variable that points to the Human class
        Human human = new Human("Bob", 123, 321, "green");
        human.speak();
        human.walk();
        human.eat();
        human.work();
        System.out.println("------");
        // steve is an instance variable that points to the Human class
        Human steve = new Human("Steve", 22, 50, "red");
        steve.speak();
        steve.eat();
        steve.work();
        steve.walk();
        System.out.println("------");
        // joe is an instance variable that points to the Human class
        Human joe = new Human("Joe", 25, 52, "blue");
        joe.speak();
        System.out.println("------");
        // tom is an instance variable that points to the Human class
        Human tom = new Human("Tom", 24, 99, "brown");
        tom.speak();
    }
}
