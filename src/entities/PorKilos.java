package entities;

public class PorKilos extends Product{

    public PorKilos(String name, Integer price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Nombre: "+this.name+" /// "+"Precio: $"+this.price+" /// "+"Unidad de venta: kilo";
        //Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo
    }
}
