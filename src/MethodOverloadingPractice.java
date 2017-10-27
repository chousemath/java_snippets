public class MethodOverloadingPractice {
    static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches >= 12) return -1;
        final double inchesToCentimeters = 2.54;
        return (feet * 12 + inches) * inchesToCentimeters;
    }

    static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) return -1;
        return calcFeetAndInchesToCentimeters(inches / 12.0, 0);
    }

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(1, 12));
        System.out.println(calcFeetAndInchesToCentimeters(2, 6));
        System.out.println(calcFeetAndInchesToCentimeters(30));
    }
}
