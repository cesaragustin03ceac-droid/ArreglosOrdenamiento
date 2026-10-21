
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java
 * to edit this template
 */
package arreglos;

import java.util.Arrays;

/**
 *
 * @author Emi
 */
public class Arreglos {

    // Método burbuja tradicional
    public static void ordenamientoBurbuja(int[] arreglo) {
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    // Método burbuja mejorado
    public static void ordenamientoBurbujaMejorado(int[] arreglo) {
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            boolean huboIntercambio = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;

                    huboIntercambio = true;
                }
            }

            // Si no hubo intercambios, el arreglo ya está ordenado
            if (!huboIntercambio) {
                break;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("=== PRUEBA 1: MÉTODO BURBUJA TRADICIONAL ===");

        int[] datosDesordenados = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Arreglo inicial: "
                + Arrays.toString(datosDesordenados));

        ordenamientoBurbuja(datosDesordenados);

        System.out.println("Arreglo ordenado: "
                + Arrays.toString(datosDesordenados));

        System.out.println("\n=== PRUEBA 2: MÉTODO BURBUJA MEJORADO ===");

        // Arreglo casi ordenado para probar la optimización
        int[] datosCasiOrdenados = {2, 4, 6, 8, 12, 10, 14};

        System.out.println("Arreglo inicial: "
                + Arrays.toString(datosCasiOrdenados));

        ordenamientoBurbujaMejorado(datosCasiOrdenados);

        System.out.println("Arreglo ordenado: "
                + Arrays.toString(datosCasiOrdenados));
        
        
    }
}