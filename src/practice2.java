public class practice2 {
    public static void main(String[] args) {
        System.out.println("I am a Java class...");
        int myVal = 10_000;
        System.out.println("Here is an integer: " + myVal);
        byte myByte = 10; // -128 => 127, more efficient than an int
        byte myNewByte = (byte) (myByte / 2);
        System.out.println(myByte);
        short myShort = 12345; // has twice as much memory as a byte
        System.out.println(myShort);
        long myLong = 12323232L;
        int myNewInt = (int) myLong;
        System.out.println(myLong);

        byte newByte = 2;
        short newShort = 1_000;
        int newInt = 1_123;
        long newLong = (50_000 + 10) * (newByte + newShort + newInt);
        System.out.println("Answer to the challenge problem: " + newLong);
    }
}
