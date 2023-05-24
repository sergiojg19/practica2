/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;

/**
 *
 * @author sergio
 */
import java.util.Random;

public class Arreglos {
    public static void main(String[] args) {
        int[] arreglo = new int[1000];
        Random random = new Random();

        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(100); 
            System.out.print(arreglo[i] + " "); 
        }

       
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }

        System.out.println("\n Resultado Suma: " + suma);
        try {
            Thread.sleep(130000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

    

