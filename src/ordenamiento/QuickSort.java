/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Romero
 */
public class QuickSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        String[] nombres= new String[5]; 
        System.out.println("Ingrese 5 nombres: ");
        for(int i=0;i<5;i++){
            System.out.println("Nombre "+(i+1 )+" :");  
            nombres[i]=sc.nextLine();
        }
        quicksort(nombres, 0, nombres.length-1);
        
        System.out.println("Ordendo "+ Arrays.toString(nombres));
    }
    public static void quicksort(String[]arr, int inicio, int fin){
        
        if(inicio < fin){
            //Aqui voy a llamar la recursividad 
            int uFPivote= acomodaPivote(arr, inicio, fin);
            quicksort(arr, inicio, uFPivote-1);
            quicksort(arr, uFPivote +1, fin);
        }
    }
     public static int acomodaPivote(String[] arr, int inicial, int fin){
        
        String pivote = arr[fin];
        int posIntercambio = inicial -1;
        for (int i = inicial; i < fin; i++) {
            if(arr[i].compareTo(pivote)< 0){
                posIntercambio ++;
                String aux = arr[posIntercambio];
                arr[posIntercambio]=arr[i];
                arr[i]=aux;
            }// i
        }// for
        
        String aux =arr[posIntercambio+1];
        arr[posIntercambio+1]= arr[fin];
        arr[fin]= aux;
   
    return posIntercambio + 1;
    }
}
