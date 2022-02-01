
package Entidades;

import enumeradores.Color;
import enumeradores.Consumo;
import java.util.Scanner;

public class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora() {
    }

   

    public Lavadora(int carga, Double precio, Color color, Consumo consEnergetico, double Peso) {
        super(precio, color, consEnergetico, Peso);
        this.carga = carga;
    }

    
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
//
//  Método crearLavadora (): este método llama a crearElectrodomestico() de la
//clase padre, lo utilizamos para llenar los atributos heredados del padre y
//después llenamos el atributo propio de la lavadora.
//    
    
    
   public void crearLavadora(){
       
       Scanner leer =new Scanner(System.in).useDelimiter("\n");
       
       System.out.println("*********Lavadora***********");
       super.crearElectrodomestico();
       System.out.println("Cuantos kilos carga");
       this.carga=leer.nextInt();
       
   }
//   • Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
//si la carga es menor o igual, no se incrementará el precio. Este método debe
//llamar al método padre y añadir el código necesario. Recuerda que las
//condiciones que hemos visto en la clase Electrodoméstico también deben
//afectar al precio 

    @Override
    public void precioFinal(){
        super.precioFinal();
        if (this.carga>30) {
            super.setPrecio(super.getPrecio()+500);
                System.out.println("El precio sera modicado por ser una carga mayor  a 30 kg");
        }
        System.out.println("El precio es"+super.precio);
    }
    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }
    
}
