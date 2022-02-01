package enumeradores;
//Se debe crear también una subclase llamada Televisor con los siguientes
//atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los

import Entidades.Electrodomestico;
import enumeradores.Color;
import enumeradores.Consumo;
import java.util.Scanner;

//atributos heredados.
//Los constructores que se implementarán serán:
//• Un constructor vacío.
//• Un constructor con la resolución, sintonizador TDT y el resto de atributos
//heredados. Recuerda que debes llamar al constructor de la clase padre
public class Televisor extends Electrodomestico {

    private double pulgadas;
    private boolean TDT;

    public Televisor() {
    }


    public Televisor(double pulgadas, boolean TDT, Double precio, Color color, Consumo consEnergetico, double Peso) {
        super(precio, color, consEnergetico, Peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    public void crearTelevisor() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("***********Televisor**************");
        super.crearElectrodomestico();
        System.out.println("Ingrese las pulgadas del TV");
        this.pulgadas = leer.nextDouble();
        System.out.println("Tiene TDT" + "S/N");
        char op = leer.next().toUpperCase().charAt(0);
        this.TDT = op=='S';
    }
//Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
//aumentará $500. Recuerda que las condiciones que hemos visto en la clase
//Electrodomestico también deben afectar al precio.
    @Override
  public void precioFinal(){
        if (this.pulgadas>40) {
            super.setPrecio(super.getPrecio()*1.30);
            System.out.println("El precio fue aumentado por resolucion");
            
        }
        if(this.TDT){
            super.setPrecio(super.getPrecio()+500);
            System.out.println("El precio fue aumentado por resolucion");
        }
        System.out.println("El precio es "+ super.precio);
//  
  }
          
    
    
    
    
    
    
}
