class Calculator {
    public int evaluate(String expression) {
        int sum = 0;
        for (String intStr : expression.split("\\+")) {
            System.out.println("This is: " + intStr);
            sum += Integer.parseInt(intStr);
        }
        return sum;
    }
}

public class Evaluator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");

        System.out.println("1+2+3 = " + sum);
    }
}
