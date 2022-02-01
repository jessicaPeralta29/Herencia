
package entidades;

public class Gato extends Animal {
       @Override
       public void alimentarse(){
           System.out.println("El gato come "+ alimento);
       }

    public Gato() {
    }

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
}
