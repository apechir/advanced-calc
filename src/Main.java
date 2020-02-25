/*
 * Main Class to be executed
 * by default. CLI version.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //Runs basic test.
        double result = test();
        System.out.println("Result: " + result);
    }

    public static double test() {
        double num1, num2, result = 0.0;
        String operator;

        Operations op = new Operations();
        Scanner sc = new Scanner(System.in);
        System.out.println("[Calculator Program]");
        System.out.print("Type in two numbers: ");

        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        System.out.println("Operation to apply to " + num1 + " and " + num2 + ":");
        System.out.println("1. +\t2. -\t3. *\t4. /\t5. ^");

        operator = sc.next();

        switch(operator) {
            case "+":
            case "1":
                result = op.sum(num1, num2);
                break;
            case "-":
            case "2":
                result = op.sub(num1, num2);
                break;
            case "*":
            case "3":
                result = op.mul(num1, num2);
                break;
            case "/":
            case "4":
                result = op.div(num1, num2);
                break;
            case "^":
            case "5":
                result = op.pow(num1, num2);
                break;
            default:
                System.err.println("Operator \"" + operator + "\" is not valid. Exiting.");
        }

        return result;
    }
}
