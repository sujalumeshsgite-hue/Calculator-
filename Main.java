import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println("Simple Java Calculator");
        
        System.out.println("Enter first Number: ");
        num1 = sc.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        operator = sc.next().charAt(0);

        System.out.println("Enter second Number: ");
        num2 = sc.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.printf("Result: %.2f + %.2f = %.2f\n", num1, num2, result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("Result: %.2f - %.2f = %.2f\n", num1, num2, result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("Result: %.2f * %.2f = %.2f\n", num1, num2, result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.printf("Result: %.2f / %.2f = %.2f\n", num1, num2, result);
                }
                break;
            default:
                System.out.println("Error: Invalid operator entered.");
                break;
        }

        sc.close();
    }
}
