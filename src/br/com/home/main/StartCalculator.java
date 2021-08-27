package br.com.home.main;

import br.com.home.classes.Operatos;

import java.util.Scanner;

public class StartCalculator {

    public static void main(String[] args) {

        int n1, n2, op;

        Operatos operatos = new Operatos();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Started, welcome to a test project of a calculator abstraction");

        System.out.println("Select an option: ");
        System.out.println("1 - Sum ");
        System.out.println("2 - Subtraction ");
        System.out.println("3 - Division: ");
        System.out.println("4 - Multiplication ");
        System.out.println("0 - Exit ");

        do {
            op = scanner.nextInt();

            if (op == 1){
                System.out.println("Write the first number: ");
                n1 = scanner.nextInt();
                System.out.println("Write the second number: ");
                n2 = scanner.nextInt();
                System.out.println("Result: " + operatos.sum(n1, n1) );
            }else if (op == 2){
                System.out.println("Write the first number: ");
                n1 = scanner.nextInt();
                System.out.println("Write the second number: ");
                n2 = scanner.nextInt();
                System.out.println("Result: " + operatos.sub(n1, n1));
            }else if (op == 3){
                System.out.println("Write the first number: ");
                n1 = scanner.nextInt();
                System.out.println("Write the second number: ");
                n2 = scanner.nextInt();
                System.out.println("Result: " + operatos.div(n1, n2));
            }else if (op == 4){
                System.out.println("Write the first number: ");
                n1 = scanner.nextInt();
                System.out.println("Write the second number: ");
                n2 = scanner.nextInt();
                System.out.println("Result: " + operatos.mult(n1, n2));
            }

        }while (op != 0);

    }
}
