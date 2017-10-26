public class practice1 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int myFirstNum = 5;
        int mySecondNum = 123;
        int myThirdNum = 1 + 2 * 3;
        int myTotal = myFirstNum + mySecondNum + myThirdNum;
        int myDiff = 1000 - myTotal;
        System.out.println(myFirstNum);
        System.out.println(mySecondNum);
        System.out.println("The sum is: " + (myFirstNum + mySecondNum));
        System.out.println("The product is: " + (myFirstNum * mySecondNum * myThirdNum));
        System.out.println("The difference is: " + myDiff);

        double aDouble = 20;
        double otherDouble = 80;
        double newDouble = (aDouble + otherDouble) * 25;
        int myRemainder = (int) newDouble % 40;
        if (myRemainder <= 20) System.out.println("Total was over the limit");
    }
}
