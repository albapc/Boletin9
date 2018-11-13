
package boletin9_2;

import java.util.Scanner;

public class SumaProducto {
    private int suma=0, produto=0, cont;
    
   public void calcularSuma(){
        for (cont = 10; cont < 91; cont++) {
            suma=suma+cont;
            System.out.println("Resultado suma: "+suma);
         
        }
   }
   public void calcularProduto(){
        for (cont = 10; cont < 91; cont++) {
            produto=produto+cont;
            System.out.println("Resultado producto: "+produto);
   }
   }
}
    

