package boletin9_1;

import java.util.Scanner;

public class Numeros {

    private int num, pos = 0, neg = 0, cero = 0;

    public int pedirNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        num = sc.nextInt();
        if (num > 0) {
            pos++;
        } else if (num < 0) {
            neg++;
        } else {
            cero++;
        }
        return num;
    }

    public void calcularNumeros() {
        int cont;
        for (cont = 0; cont < 9; cont++) {
            num = pedirNumeros();
        }
    }

    public void mostrarNumeros() {
        System.out.println("Números positivos: " + pos);
        System.out.println("Números negativos: " + neg);
        System.out.println("Ceros: " + cero);
    }
}
