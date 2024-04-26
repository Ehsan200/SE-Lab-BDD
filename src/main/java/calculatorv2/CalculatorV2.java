package calculatorv2;

public class CalculatorV2 {
    public int calculate(int firstNumber, int secondNumber, String operation) {
        switch (operation) {
            case "^":
                int result = 1;
                for (int i = 1; i <= secondNumber; i++) {
                    result = result * firstNumber;
                }
                return result;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("ArithmeticException: division by zero");
                    return 0;
                }
                return firstNumber / secondNumber;
            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }
}
