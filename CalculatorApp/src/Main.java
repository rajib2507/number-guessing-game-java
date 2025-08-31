import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Simple Calculator ===");
        boolean running = true;
        while (running) {
            printMenu();
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1": binaryOp("add"); break;
                case "2": binaryOp("subtract"); break;
                case "3": binaryOp("multiply"); break;
                case "4": binaryOp("divide"); break;
                case "5": scientificMenu(); break;
                case "0": running = false; break;
                default: System.out.println("Unknown option. Try again.");
            }
            System.out.println();
        }
        System.out.println("Goodbye!");
    }

    private static void printMenu() {
        System.out.println("Choose an operation:");
        System.out.println("1) Add");
        System.out.println("2) Subtract");
        System.out.println("3) Multiply");
        System.out.println("4) Divide");
        System.out.println("5) Scientific functions (sin, cos, pow, sqrt)");
        System.out.println("0) Exit");
        System.out.print("Enter choice: ");
    }

    private static void binaryOp(String op) {
        double a = readDouble("Enter first number: ");
        double b = readDouble("Enter second number: ");
        double res = 0;
        switch (op) {
            case "add": res = a + b; break;
            case "subtract": res = a - b; break;
            case "multiply": res = a * b; break;
            case "divide":
                if (b == 0) {
                    System.out.println("Error: Division by zero.");
                    return;
                }
                res = a / b;
                break;
        }
        System.out.println("Result: " + res);
    }

    private static void scientificMenu() {
        System.out.println("Scientific:");
        System.out.println("a) sin(x)  b) cos(x)  c) pow(x,y)  d) sqrt(x)  e) back");
        System.out.print("choice: ");
        String c = scanner.nextLine().trim().toLowerCase();
        switch (c) {
            case "a": {
                double x = readDouble("Enter angle in radians: ");
                System.out.println("sin(" + x + ") = " + Math.sin(x));
                break;
            }
            case "b": {
                double x = readDouble("Enter angle in radians: ");
                System.out.println("cos(" + x + ") = " + Math.cos(x));
                break;
            }
            case "c": {
                double base = readDouble("Enter base: ");
                double exp = readDouble("Enter exponent: ");
                System.out.println("pow = " + Math.pow(base, exp));
                break;
            }
            case "d": {
                double x = readDouble("Enter number: ");
                if (x < 0) System.out.println("Error: negative number.");
                else System.out.println("sqrt(" + x + ") = " + Math.sqrt(x));
                break;
            }
            default: /* back or invalid -> return */ break;
        }
    }

    private static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine().trim();
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, try again.");
            }
        }
    }
}


