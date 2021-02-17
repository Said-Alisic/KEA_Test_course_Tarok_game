package tarot_src;

import org.junit.Test;

import java.util.Scanner;


public class Main {

    protected static Scanner scn = new Scanner(System.in);  // Create a Scanner object

    public static void main(String[] args) {
        calc();

    }

    private static void calc() {
        try {
            System.out.print("Enter first number (Remember spacing between inputs): ");
            double x = scn.nextDouble();  // Read first user input number
            String sign = scn.next();  // Read user input operator
            double y = scn.nextDouble();  // Read second user input number

            System.out.println();
            System.out.print("= ");
            System.out.println(calc_solve(x, y, sign));
        } catch (Exception e) {
            System.out.println("System failed.");
        }

    }

    @Test
    private static double calc_solve(double x, double y, String sign) {

        double result = 0.0;
        try {
            if(sign.equals("+")) {
                result = x + y;

            } else if(sign.equals("-")) {
                result = x - y;

            } else if(sign.equals("*")) {
                result = x * y;

            } else if(sign.equals("/")) {
                result = x / y;

            } else if(sign.equals("%")) {
                result = x % y;
            }
            return result;
        } catch (Exception e) {
            System.out.println("System failed.");
            return result;
        }
    }
}