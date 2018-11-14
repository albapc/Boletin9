package boletin9_5;

import java.util.Scanner;

public class Series {

    private int num, i;
    Scanner sc = new Scanner(System.in);

    public void serieA() {
        int a1 = 2;
        do {
            System.out.println("Introduce un número maior que 1:");
            num = sc.nextInt();
        } while (num <= 1);
        System.out.println("Os " + num + " números da serie A son:");

        for (i = 1; i <= num; i++) {
            a1 = a1 + 2;
            System.out.print(a1 + " + ");
        }
    }

    public void serieB() {
        int b1 = 1;
        do {
            System.out.println("Introduce un número maior que 1:");
            num = sc.nextInt();
        } while (num <= 1);
        System.out.println("Os " + num + " números da serie B son:");

        for (int i = 0; i < num; i++) {
            if (b1 % 2 == 0) {
                System.out.print(" + " + b1);
            } else {
                System.out.print(" - " + b1);
            }
            b1++;
        }
    }

    public void serieC() {
        int c1 = 0, c2 = 1;
        do {
            System.out.println("Introduce un número maior que 1:");
            num = sc.nextInt();
        } while (num <= 1);
        System.out.println("Os " + num + " números da serie C son:");

        System.out.print(c1 + ", ");
        for (i = 2; i <= num; i++) {
            System.out.print(c2 + ", ");
            c2 = c1 + c2;
            c1 = c2 - c1;
        }
    }
}
