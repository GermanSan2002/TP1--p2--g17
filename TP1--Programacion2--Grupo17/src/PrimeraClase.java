/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class PrimeraClase {
    String unaCadena;
    int unEntero;
    
    public void mostrar(){
        System.out.println("\tUnaCadena = "+ unaCadena);
        System.out.println("\tUnEntero = "+ unEntero);
    }
    
    public static void main(String[] args) {
        PrimeraClase objeto1 = new PrimeraClase();
        PrimeraClase objeto2 = new PrimeraClase();
        PrimeraClase objeto3 = new PrimeraClase();
        PrimeraClase objeto4 = new PrimeraClase();
        PrimeraClase objeto5 = new PrimeraClase();
        
        objeto1.unaCadena = "Aire acondicionado";
        objeto1.unEntero = 4;
        objeto2.unaCadena = "Pizzarra";
        objeto2.unEntero = 2;
        objeto3.unaCadena = "Proyectores";
        objeto3.unEntero = 2;
        objeto4.unaCadena = "Asientos";
        objeto4.unEntero = 200;
        objeto5.unaCadena = "Ventiladores";
        objeto5.unEntero = 4;
        
        PrimeraClase[] vector = new PrimeraClase[5];
        vector[0]=objeto1;
        vector[1]=objeto2;
        vector[2]=objeto3;
        vector[3]=objeto4;
        vector[4]=objeto5;
        
        mostrarVectorObjetos(vector);
    }
    
    static void mostrarVectorObjetos(PrimeraClase[] vector){
        int i=0;
        
        System.out.println("Los elementos del vector son:");
        for(PrimeraClase r: vector){
            System.out.println("Vector["+i+"]:");
            r.mostrar();
            i++;
        }
    }
}
