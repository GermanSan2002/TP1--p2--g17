/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String[] args) {
        int entero = 5;
        float flotante;
        flotante = 25.4f;
        double doble = 3.645;
        String cadena = "Esto es una cadena";
        
        System.out.println("Entero = "+ entero);
        System.out.println("Flotante = "+ flotante);
        System.out.println("Doble = "+ doble);
        System.out.println("Flotante = "+ cadena);
        
        float[] flotantes={5.2f, 35.4f, 25.48f, 4.59f, 17.9f};
        
        int i;
        
        System.out.println("El arreglo de flotantes contiene los siguientes valores");
        for(i=0; i<flotantes.length; i++){
            System.out.println("\t"+ flotantes[i]);            
        }
        
        float promedio = promedio(flotantes);
        
        System.out.println("El promedio de los elementos del arreglo de flotantes es "+promedio);
    }
    
    static float promedio(float[] vector){
        int i;
        float suma = 0f, promedio;
        
        for(i=0; i<vector.length; i++){
            suma = suma + vector[i];
        }
        promedio = suma / vector.length;
        
        return promedio;
    }
}
