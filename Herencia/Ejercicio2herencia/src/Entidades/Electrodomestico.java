//        Crear una superclase llamada Electrodoméstico con los siguientes atributos:
//precio, color, consumo energético (letras entre A y F) y peso.
//Los constructores que se deben implementar son los siguientes:
//• Un constructor vacío.
//• Un constructor con todos los atributos pasados por parámetro.
//Los métodos a implementar son:
//• Métodos getters y setters de todos los atributos.
package Entidades;

import enumeradores.Color;
import enumeradores.Consumo;
import java.util.Scanner;

public abstract class Electrodomestico {

    protected Double precio;
    protected Color color;
    protected Consumo consEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, Color color, Consumo consEnergetico, double Peso) {
        this.precio = precio;
        this.color = color;
        this.consEnergetico = consEnergetico;
        this.peso = Peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Consumo getConsEnergetico() {
        return consEnergetico;
    }

    public void setConsEnergetico(Consumo consEnergetico) {
        this.consEnergetico = consEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int Peso) {
        this.peso = Peso;
    }

//
//    Método comprobarConsumoEnergetico(char letra): comprueba que la letra
//es correcta, sino es correcta usara la letra F por defecto. Este método se debe
//invocar al crear el objeto y no será visible.
//    
    private void comprobarConsumoEnergetico(char letra) {

        switch (letra) {
            case 'A':
                this.consEnergetico = Consumo.A;
                break;
            case 'B':
                this.consEnergetico = Consumo.B;
                break;
            case 'C':
                this.consEnergetico = Consumo.C;
                break;
            case 'D':
                this.consEnergetico = Consumo.D;
                break;
            case 'E':
                this.consEnergetico = Consumo.E;
                break;
            case 'F':
                this.consEnergetico = Consumo.F;
                break;
            default:
                System.out.println("Ingreso una opcion no valida se asignara el consumo por defecto");
                this.consEnergetico = Consumo.F;

        }
    }

//        Método comprobarColor(String color): comprueba que el color es correcto, y
//si no lo es, usa el color blanco por defecto. Los colores disponibles para los
//electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
//está en mayúsculas o en minúsculas. Este método se invocará al crear el
//objeto y no será visible.
    private void comprobarColor(String color) {
        switch (color) {
            case "BLANCO":
                this.color = Color.BLANCO;
                break;
            case "NEGRO":
                this.color = Color.NEGRO;
                break;
            case "ROJO":
                this.color = Color.ROJO;
                break;
            case "GRIS":
                this.color = Color.GRIS;
                break;
            case "AZUL":
                this.color = Color.AZUL;
                break;
            default:
                System.out.println("Ingreso una opcion no valida se asignara el color por defecto");
                this.color = Color.BLANCO;
        }
    }
//Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el
//consumo. Al precio se le da un valor base de $1000.
//    
//    

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        this.precio = 1000.00;
        System.out.println("Ingrese el color del electrodomestico");
        comprobarColor(leer.next().toUpperCase());
        System.out.println("Cual es el consumo energetico? (A,B,C,D o F)");
        comprobarConsumoEnergetico(leer.next().toUpperCase().charAt(0));
        System.out.println("Cuanto pesa?");
        this.peso= leer.nextDouble();

    }
//    Método precioFinal(): según el consumo energético y su tamaño, aumentará
//el valor del precio. Esta es la lista de precios:
    
   public void  precioFinal(){
       if (this.peso > 80) {
            this.precio += 1000;
        } else if (this.peso >= 50) {
            this.precio += 800;
        } else if (this.peso >= 20) {
            this.precio += 500;
        } else {
            this.precio += 100;
        }
    
  switch (this.consEnergetico) {
            case A:
                this.precio += 1000;
                break;
            case B:
                this.precio += 800;
                break;
            case C:
                this.precio += 600;
                break;
            case D:
                this.precio += 500;
                break;
            case E:
                this.precio += 300;
                break;
            case F:
                this.precio += 100;
                break;
        }
}

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consEnergetico=" + consEnergetico + ", peso=" + peso + '}';
    }
   
}
