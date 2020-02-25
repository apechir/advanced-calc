/*
 * Basic operations between
 * two numbers.
 */

public class Operations {
    final int N = 3;

    private int rounding; //round double to N decimal places

    //constructor:

    public Operations() {
        this.rounding = N;
    }

    //setters:

    public void setRounding(int rounding) {
        if (rounding >= 0) {
            this.rounding = rounding;
        }
        else {
            System.err.println("The rounding attribute cannot be negative!");
        }
    }

    //getters:

    public int getRounding() {
        return rounding;
    }

    //operation methods:

    public int sum(int a, int b) { //integer addition
        return a + b;
    }

    public double sum(double a, double b) { //double addition
        return round(a + b);
    }

    public int sub(int a, int b) { //integer subtraction
        return a - b;
    }

    public double sub(double a, double b) { //double subtraction
        return round(a - b);
    }

    public int mul(int a, int b) { //integer multiplication
        return a * b;
    }

    public double mul(double a, double b) { //double multiplication
        return round(a * b);
    }

    public double div(int a, int b) { //integer division
        return round((double)a / b);
    }

    public double div(double a, double b) { //double division
        return round(a / b);
    }

    public int pow(int a, int n) { //int exponentiation
        int result = a;
        for (int i = 0; i < n; i++) {
            result = result * a;
        }
        return result;
    }

    public double pow(double a, double n) { //double exponentiation
        double result = a;
        for (int i = 0; i < Math.round(n); i++) {
            result = result * a;
        }
        return round(result);
    }

    //other methods:

    public double round(double a) { //rounds double to N decimal places
        if (this.rounding != 0) {
            double places = pow(10, this.rounding)/10f;
            return Math.round(a * places)/places;
            /*
             * This fragment of code uses the Math library round method,
             * which rounds a decimal number to its nearest integer,
             * and multiplies "a" by "places" and then divides
             * the result by "places". This way, we can round a
             * double number to any number of decimal places.
             */
        }
        else {
            /*
             * If this.rounding equals 0 I want the program to
             * return the double number without any roundings.
             * A negative value is not allowed.
             */
            return a;
        }
    }
}
