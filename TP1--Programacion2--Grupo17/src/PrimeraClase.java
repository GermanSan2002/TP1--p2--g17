
import java.util.ArrayList;

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
        
        ArrayList<PrimeraClase> objetos = new ArrayList<>();
        objetos.add(objeto1);
        objetos.add(objeto2);
        objetos.add(objeto3);
        objetos.add(objeto4);
        objetos.add(objeto5);
        
        mostrarVectorObjetos(objetos);
        
        //modificar elemento 3 (posicion 2)
        PrimeraClase objeto6 = new PrimeraClase();
        objeto6 = objetos.get(2);
        objeto6.unaCadena = "Lapicera";
        objeto6.unEntero = 25;
        objetos.remove(2);
        objetos.add(2, objeto6);
        
        mostrarVectorObjetos(objetos);
    }
    
    static void mostrarVectorObjetos(ArrayList<PrimeraClase> lista){
        int i=1;
        
        System.out.println("Los elementos del vector son:");
        for(PrimeraClase r: lista){
            if(r!=null){
                System.out.println("Objeto "+i+":");
                r.mostrar();
            }
            i++;
        }
    }
}
