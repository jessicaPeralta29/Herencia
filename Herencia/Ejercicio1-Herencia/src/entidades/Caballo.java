
package entidades;


public class Caballo extends Animal {
       @Override
       public  void alimentarse(){
           System.out.println("Elcaballo se alimenta de de "+ super.alimento);
           
           
       }

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
       
}
