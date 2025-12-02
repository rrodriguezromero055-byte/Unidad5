/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos_busqueda;

/**
 *
 * @author Romero
 */
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
public class ArraysBinarySearch {
    public static void main(String[] args) {
        List<String> nombres= Arrays.asList("Ana", "Luis","Alberto","Bea");
        
        //Filtrar nombres que empeizan con A
        List<String> resultado= nombres.stream()
                .filter(n -> n.startsWith("A"))
                .collect(Collectors.toList());
        
        System.out.println(resultado);
    }
}
