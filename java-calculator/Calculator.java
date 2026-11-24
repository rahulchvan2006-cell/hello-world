import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Simple Java Calculator");
        System.out.print("Enter first number: ");
        double first = input.nextDouble();
        System.out.print("Choose +, -, *, or /: ");
        char operation = input.next().charAt(0);
        System.out.print("Enter second number: ");
        double second = input.nextDouble();
        double result;
        switch (operation) {
            case '+': result = first + second; break;
            case '-': result = first - second; break;
            case '*': result = first * second; break;
            case '/':
                if (second == 0) {
                    System.out.println("Cannot divide by zero.");
                    input.close();
                    return;
                }
                result = first / second;
                break;
            default:
                System.out.println("Unknown operation.");
                input.close();
                return;
        }
        System.out.println("Result: " + result);
        input.close();
    }
}
