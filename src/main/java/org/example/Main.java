package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the expression (without spaces like 2+3) :");
        Scanner sc = new Scanner(System.in);
        String ex = sc.nextLine();
        int x = Integer.parseInt(ex.substring(0,1));
        int y = Integer.parseInt(ex.substring(2));

        Calculator calc = new Calculator();

        switch (ex.substring(1,2)) {
            case "+":
                System.out.println(calc.add(x, y));
                break;
            case "-":
                System.out.println(calc.subtract(x, y));
                break;
            case "*":
                System.out.println(calc.multiply(x, y));
                break;
            case "/":
                try {
                    System.out.println(calc.divide(x, y));
                } catch (ArithmeticException e) {
                    System.out.println("Error!! " + e.getMessage());
                }
        }
    }
}