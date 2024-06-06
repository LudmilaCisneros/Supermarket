package entities;

public class PorLitros extends Product{

    private double litros;

    public PorLitros(String name, Integer price, double litros) {
        super(name, price);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.name + " /// " + "Litros: "+this.litros + " /// " + "Precio: $" + this.price;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }
}
