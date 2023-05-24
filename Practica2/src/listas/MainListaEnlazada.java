/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas;

/**
 *
 * @author sergio
 */
import java.util.Random;


public class MainListaEnlazada {

    public static void main(String[] args) {
        while (true) {
            ListaEnlazada lista = new ListaEnlazada();
            Random random = new Random();

           
            for (int i = 0; i < 1000; i++) {
                int dato = random.nextInt(100); 
                lista.insertar(dato);
                System.out.print(dato + " "); 
            }

           
            int suma = lista.sumar();

            System.out.println("\n Resultado Suma: " + suma);
            try {
                Thread.sleep(130000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
