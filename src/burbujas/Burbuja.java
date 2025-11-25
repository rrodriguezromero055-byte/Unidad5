/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burbujas;

/**
 *
 * @author Romero
 */
import java.util.Arrays;
public class Burbuja {
    public static void main(String[] args) {
        int numero[]={45,17,23,67,21};
        int vueltas=1;
        for(int j=0;j<numero.length -1; j++){
        for(int i=0; i<numero.length-j-1; i++){
            if(numero[i]>numero[i+1]){
                int aux= numero[i];//gurada el valor 
                numero[i]=numero[i+1];//sobreesc
                numero[i+1]=aux;//regreso el 
                
            }
            System.out.println(vueltas + ":"+ Arrays.toString(numero));vueltas++;
        }
    }
        
    }
}
