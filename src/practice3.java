public class practice3 {
    public static void main(String[] args) {
        System.out.println("Hello from practice 3");
        int myVal = 5;
        float myFloat = (float) 123.123;
        float myOtherFloat = 222.333f;
        double myDouble = 123.123123123d;

        System.out.println("My int value: " + myVal);
        System.out.println("My float is: " + myFloat);
        System.out.println("Example of integer division: " + (myVal / 2));

        final double LBS_TO_KG = 0.45359237d;
        double lbs = 1;
        double kg = lbs * LBS_TO_KG;
        System.out.println("The answer is: " + kg);
    }
}
