package entities;

public class PorMiliLitros extends Product{

    private int contenido;

    public PorMiliLitros(String name, Integer price, int contenido) {
        super(name, price);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.name + " /// " + "Contenido: " + this.contenido + "ml /// " + "Precio: $" + this.price;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }
}
