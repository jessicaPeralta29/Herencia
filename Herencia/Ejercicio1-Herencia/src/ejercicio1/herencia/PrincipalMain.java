
package ejercicio1.herencia;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;




public class PrincipalMain {

  
    public static void main(String[] args) {
        //Perro
        
      Animal choco =new Perro("Stich",  "carnivoro", 15, "doberman");
      choco.alimentarse();
      
      
        Animal michi =new Gato("Pelusa ", "galletas", 12, "Siames ");
     michi.alimentarse();
      
      
        Animal ico =new Caballo("Spark",  "Pasto", 10, "fino");
      
      ico.alimentarse();
      
      
      
    }
    
}
