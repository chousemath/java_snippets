public class ArrayStructures2 {
    private int[] theArray = new int[50];
    private int arraySize = 10;

    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random() * 10 + 10);
        }
    }

    public void printArray() {
        System.out.println("----------");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + "| ");
            System.out.println(theArray[i] + " |");
            System.out.println("----------");
        }
    }

    public int getValueAtIndex(int i) {
        if (i < arraySize) return theArray[i];
        return 0;
    }

    public boolean doesArrayContainThisValue(int searchValue) {
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == searchValue) return true;
        }
        return false;
    }

    public void deleteIndex(int index) {
        if (index < arraySize) {
            for (int i = index; i < arraySize - 1; i++) {
                theArray[i] = theArray[i + 1];
            }
            arraySize--;
        }
    }

    public void appendValue(int value) {
        if (arraySize >= 50) return;
        theArray[arraySize] = value;
        arraySize++;
    }

    public String linearSearch(int value) {
        String searchStr = "";
        boolean valueInArray = false;
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value) {
                if (valueInArray) {
                    searchStr += ", " + i;
                    valueInArray = true;
                }
                else searchStr += i;
            }
        }
        return searchStr;
    }

    public static void main(String[] args) {
        ArrayStructures2 myArray = new ArrayStructures2();
        myArray.generateRandomArray();
        myArray.printArray();
        System.out.println("Value at index 3 is " + myArray.getValueAtIndex(3));
        System.out.println("Does the array contain 13? " + myArray.doesArrayContainThisValue(13));
        System.out.println("Does the array contain 14? " + myArray.doesArrayContainThisValue(14));
        System.out.println("Does the array contain 15? " + myArray.doesArrayContainThisValue(15));
        myArray.deleteIndex(3);
        myArray.printArray();
        myArray.appendValue(11);
        myArray.printArray();
        System.out.println("The indexes where 13 is located are " + myArray.linearSearch(13));
        System.out.println("The indexes where 13 is located are " + myArray.linearSearch(12));
    }
}
