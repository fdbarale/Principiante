/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumanum;

import java.util.Scanner;

/**
 *
 * @author Fernando Barale
 */
public class Sumanum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //asigno tipo variable a introducir dato
        System.out.println("Introduzca los numeros a sumar");

        int numEntUno = leer.nextInt();
        int numEntDos = leer.nextInt();
        int numEntRes = numEntUno + numEntDos;
        System.out.println("La suma de los numeros es igual a: " + (numEntUno + numEntDos));

    }

}
