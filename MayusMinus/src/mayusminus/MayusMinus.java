/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayusminus;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Fernando Barale
 */
public class MayusMinus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Introduzca una frase");
        String frase = leer.nextLine();

        System.out.println("La frase en mayuscula es: " + toUpperCase(frase));
        System.out.println("La frase en minuscula es: " + toLowerCase(frase));

    }

}
