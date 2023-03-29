/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Fernando Barale
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "Fernando ";
        String apellido = "Barale";
        double altura = 1.95;
        double peso = 125.50;
        int anonac = 1982;
        int edad = 2023 - anonac;

        System.out.println(nombre + "" + apellido + " tiene:");

        System.out.println("*Una altura de: " + altura + " metros.");
        System.out.println("*Un peso de: " + peso + " kilos.");
        System.out.println("*Una edad de: " + edad + " años, ya que naciò en el año " + anonac);
    }

}
