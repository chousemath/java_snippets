public class TestStack {
    public static void main(String[] args) {
        DsStack newStack = new DsStack(50);
        if (newStack.isEmpty()) System.out.println("I am empty!");
        newStack.push(12345);
        System.out.println("Peekaboo! " + newStack.peek());
        System.out.println("Pop the stack: " + newStack.pop());
        if (newStack.isEmpty()) System.out.println("I am empty!");
        System.out.println("This should be 0: " + newStack.pop());
        if (newStack.isEmpty()) System.out.println("I am empty!");
        String stringToReverse = "ohio";
        System.out.println(reverseString(stringToReverse, new CharStack(stringToReverse.length())));
    }

    public static String reverseString(String str, CharStack stack) {
        for (char c : str.toCharArray()) stack.push(c);
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
