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


            Number a = new Number();
            Number b = new Number();
            System.out.print("Enter number x a> ");
            a.setA(input.nextInt());
            System.out.print("Enter number x b> ");
            b.setA(input.nextInt());
            System.out.print("Enter number y a> ");
            a.setB(input.nextInt());
            System.out.print("Enter number y b> ");
            a.setB(input.nextInt());

            switch(calculation()){
                
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

}
