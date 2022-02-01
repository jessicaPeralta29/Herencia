package ejercicio2herencia;


import Entidades.Electrodomestico;
import Entidades.Lavadora;
import enumeradores.Color;
import enumeradores.Consumo;
import enumeradores.Televisor;
import java.util.ArrayList;

public class Ejercicio2herencia {

    public static void main(String[] args) {
//Ejercicio 1
//        Lavadora Lava = new Lavadora();
//        Televisor TV = new Televisor();
//        Lava.crearLavadora();
//        Lava.precioFinal();
//        TV.crearTelevisor();
//        TV.precioFinal();
   
/*
EJERCICIO 2
*/
        
   double acuTotal = 0, acuLava = 0, acuTv = 0;
        ArrayList<Electrodomestico> comercio = new ArrayList();

        Lavadora l1 = new Lavadora(15, 1000.0, Color.ROJO, Consumo.C, 15.2);
        comercio.add(l1);
        Lavadora l2 = new Lavadora(20, 2500.0, Color.AZUL, Consumo.A, 16.3);
        comercio.add(l2);
        Televisor t1 = new Televisor(43, true, 5000.0, Color.NEGRO, Consumo.C,5);
        comercio.add(t1);
        Televisor t2 = new Televisor(54, true, 6800.0, Color.NEGRO, Consumo.A,5);
        comercio.add(t2);     
        
        for (Electrodomestico aux : comercio) {
          aux.precioFinal();
            System.out.println(aux);
            acuTotal += aux.getPrecio();
            if (aux instanceof Lavadora) {
        
                acuLava+=aux.getPrecio();
            }else if(aux instanceof Televisor){
                acuTv+=aux.getPrecio();
            
            }
        }
        
         System.out.println("El precio de todos los Lavarropas es: "+acuLava);
        System.out.println("El precio de todos los Televisores es: "+acuTv);
        System.out.println("El precio total de todos los electrodomesticos es: "+acuTotal);
        
        
    }
}