package boletin9_6;

import java.util.Scanner;

public class Soldos {

    private int numTraballadores = 0, soldo1 = 0, soldo2 = 0;
    private double soldo;

    Scanner sc = new Scanner(System.in);

    public void calcularSoldos() {
        do {
            System.out.println("Introduce soldo do empregado:");
            soldo = sc.nextDouble();

            if (soldo > 0) {
                numTraballadores++;
            }

            if (soldo >= 1000 && soldo <= 1750) {
                soldo1++;

            } else if (soldo < 1000 && soldo > 0) {
                soldo2++;
            }

        } while (soldo != 0);

        System.out.println("Número de traballadores con soldos entre 1000 e "
                + "1750 €: " + soldo1);

        System.out.println("Porcentaxe de traballadores que gañan menos "
                + "de 1000 €: " + (soldo2 * 100 / numTraballadores));
    }
}
