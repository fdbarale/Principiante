/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menunumeros;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class MenuNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar 2 numeros positivos");
        System.out.print(">");
        int num1 = leer.nextInt();
        System.out.println(">");
        int num2 = leer.nextInt();
        int opcion;
        String salir = "n";
        
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opcion");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma de ambos numeros es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de ambos numeros es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicaciond e ambos numeros es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La divisiond de ambos numeros es " + (num1 / num2));
                    break;

                default:
                    if (opcion == 5) {
                        System.out.print("Desea salir realmente? S/N");
                        salir = leer.nextLine();
                        break;
                    } else {
                        System.out.println("Opcion no valida, reintente");
                        break;
                    }
            } while (salir.equalsIgnoreCase("n"));
        }
    }
}

