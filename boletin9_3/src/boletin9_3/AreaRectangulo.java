package boletin9_3;

import javax.swing.JOptionPane;

public class AreaRectangulo {

    private double base, altura;

    public void calcularArea() {
        do {
            base = Double.parseDouble(JOptionPane.showInputDialog("Introduce a base:"));
        } while (base <= 0);
        do {
            altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce a altura:"));
        } while (altura <= 0);
    }

    public void mostrarArea() {
        System.out.println("A área do rectángulo é: " + base * altura);
    }

}
