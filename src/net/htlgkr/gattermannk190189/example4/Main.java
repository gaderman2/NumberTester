package net.htlgkr.gattermannk190189.example4;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in, "Windows-1252");

    public static void main(String[] args) {
        RationalCalculator rationalCalculator = new RationalCalculator(
                (x, y) -> {
                    Number number = new Number();
                    number.setA(x.getA() + y.getA());
                    number.setB(x.getB() + y.getB());
                    return number;
                },
                (x, y) -> {
                    Number number = new Number();
                    number.setA(x.getA() - y.getA());
                    number.setB(x.getB() - y.getB());
                    return number;
                },
                (x, y) -> {
                    Number number = new Number();
                    number.setA(x.getA() * y.getA());
                    number.setB(x.getB() * y.getB());
                    return number;
                },
                (x, y) -> {
                    Number number = new Number();
                    number.setA(x.getA() / y.getA());
                    number.setB(x.getB() / y.getB());
                    return number;
                }
        );
        VectorCalculator vectorCalculator = new VectorCalculator(
                (x, y) -> {
                    Number number = new Number();
                    number.setA(x.getA() + y.getA());
                    number.setB(x.getB() + y.getB());
                    return number;
                },
                (x, y) -> {
                    Number number = new Number();
                    number.setA(x.getA() - y.getA());
                    number.setB(x.getB() - y.getB());
                    return number;
                },
                (x, y) -> {
                    Number number = new Number();
                    number.setA(x.getB() * y.getA() - x.getA() * y.getB());
                    number.setB(x.getB() * y.getA() - x.getA() * y.getB());
                    return number;
                },
                (x, y) -> {
                    Number number = new Number();
                    number.setA(x.getA() * y.getB() + y.getA() * y.getB());
                    number.setB(x.getA() * y.getB() + y.getA() * y.getB());
                    return number;
                }
        );
        ComplexCalculator complexCalculator = new ComplexCalculator(
                (x, y) -> {
                    Number number = new Number();
                    number.setA(x.getA() + y.getA());
                    number.setB(x.getB() + y.getB());
                    return number;
                },
                (x, y) -> {
                    Number number = new Number();
                    number.setA(x.getA() - y.getA());
                    number.setB(x.getB() - y.getB());
                    return number;
                },
                (x, y) -> {
                    Number number = new Number();
                    number.setA(x.getA() * y.getA());
                    number.setB(x.getB() * y.getB());
                    return number;
                },
                (x, y) -> {
                    Number number = new Number();
                    number.setA(x.getA() / y.getA());
                    number.setB(x.getB() / y.getB());
                    return number;
                }
        );

        while (true) {

            int menu = menu();

            if (menu == 4) System.exit(1);

            while(true) {
                Number a = new Number();
                Number b = new Number();
                System.out.print("Enter number x a> ");
                a.setA(input.nextInt());
                System.out.print("Enter number x b> ");
                a.setB(input.nextInt());
                System.out.print("Enter number y a> ");
                b.setA(input.nextInt());
                System.out.print("Enter number y b> ");
                b.setB(input.nextInt());

                int calculation = calculation();

                if(calculation <= 0 || calculation > 4) continue;

                System.out.println("----------------------");
                System.out.println("Solution:");

                switch (calculation) {
                    case 1:
                        switch (menu) {
                            case 1 -> printResults(rationalCalculator.add(a, b));
                            case 2 -> printResults(vectorCalculator.add(a, b));
                            case 3 -> printResults(complexCalculator.add(a, b));
                        }
                        break;

                    case 2:
                        switch (menu) {
                            case 1 -> printResults(rationalCalculator.subtract(a, b));
                            case 2 -> printResults(vectorCalculator.subtract(a, b));
                            case 3 -> printResults(complexCalculator.subtract(a, b));
                        }
                        break;

                    case 3:
                        switch (menu) {
                            case 1 -> printResults(rationalCalculator.multiply(a, b));
                            case 2 -> printResults(vectorCalculator.multiply(a, b));
                            case 3 -> printResults(complexCalculator.multiply(a, b));
                        }
                        break;

                    case 4:
                        switch (menu) {
                            case 1 -> printResults(rationalCalculator.divide(a, b));
                            case 2 -> printResults(vectorCalculator.divide(a, b));
                            case 3 -> printResults(complexCalculator.divide(a, b));
                        }
                        break;
                }

                System.out.println("----------------------");
                break;
            }
        }
    }

    private static int menu() {
        System.out.println("Choose calculator:");
        System.out.println("1 - Relational Calculator");
        System.out.println("2 - Vector Calculator");
        System.out.println("3 - Complex Calculator");
        System.out.println("4 - Exit Programm");

        return input.nextInt();
    }

    private static int calculation() {
        System.out.println("Choose operation:");
        System.out.println("1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - multiply");
        System.out.println("4 - divide");
        System.out.println("5 - enter numbers again");

        return input.nextInt();
    }

    private static void printResults(Number result){
        System.out.println("a = " + result.getA());
        System.out.println("b = " + result.getB());
    }

}
