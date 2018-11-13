
package boletin9_4;

import javax.swing.JOptionPane;

public class TaboaMultiplicar {
    private int num;
    
    public void pedirNumero(){
        num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
        
        if(num>0){
        do{ 
        multiplicar();
        num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
        } while(num>0);    
        } else{
            System.out.println("****Fin do programa****");            
        }
    }
    public void multiplicar(){
        System.out.println("*************Táboa do "+num+"*************");
        for(int i=1; i<=10; i++){
            System.out.println(num+" * "+i+" = "+num);
        }
    }
}

