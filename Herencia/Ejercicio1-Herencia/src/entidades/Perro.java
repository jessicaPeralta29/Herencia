
package entidades;

public class Perro extends Animal {
       @Override
       public  void alimentarse(){
           System.out.println("El perro come "+ super.alimento);
       }

    public Perro() {
    }

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    
       
    
    
}
