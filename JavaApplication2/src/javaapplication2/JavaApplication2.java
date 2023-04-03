/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaHastaMaximo;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     
     System.out.println("Ingrese el valor maximo al cual llegar");
     System.out.println(">");
     int max = leer.nextInt();
     int cont = 0;
     do {
         System.out.println("Ingrese numeros positivos hasta llegar automaticamente al valor definido");
         int sum = leer.nextInt();
         cont = cont + sum;
         System.out.println("Total provisorio = " + cont);
     }
     while (cont == max);
    
    }
    
}
