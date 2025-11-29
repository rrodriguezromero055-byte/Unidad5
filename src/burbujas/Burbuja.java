/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burbujas;

/**
 *
 * @author Romero
 */
import java.util.Scanner;
import java.util.Arrays;
public class Burbuja {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nombres[]= new String[5];
        int vueltas=1;
        
        //Pide los cinco nombres 
        for(int i=0;i<5;i++){
            System.out.println("Nombre "+(i+1 )+" :");  
            nombres[i]=sc.nextLine();
        }
        // Algoritmo de burbujas para string
        for(int j=0;j<nombres.length -1; j++){
        for(int i=0; i<nombres.length-j-1; i++){
            // compareToIgnoreCase para comparar cadenas
            if(nombres[i].compareToIgnoreCase(nombres[i+1])>0){
                
                //intercambio
                String aux= nombres[i];//gurada el valor 
                nombres[i]=nombres[i+1];//sobreesc
                nombres[i+1]=aux;//regreso el 
                
            }
            //Mostrar arrgelo ordenado
            System.out.println("Nombres ordenados:");
            System.out.println(vueltas + ":"+ Arrays.toString(nombres));vueltas++;
        }
    }
        
    }
}
