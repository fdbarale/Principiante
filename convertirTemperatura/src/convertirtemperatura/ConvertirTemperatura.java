/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertirtemperatura;

import java.util.Scanner;

/**
 *
 * @author Fernando Barale
 */
public class ConvertirTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba la temperatura en grados centigrados");
        double grados = leer.nextInt();
        double faren = 32 + (9 * grados / 5);

        System.out.println("La temperatura convertida es de: " + faren);

    }

}
