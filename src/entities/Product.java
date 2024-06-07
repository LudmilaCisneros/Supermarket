package entities;

public abstract class Product implements Comparable<Product>{

    protected String name;
    protected Integer price;

    protected Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Nombre: " + this.name + " /// " + "Precio: $"+ this.price;
    }

    @Override
    public int compareTo(Product x) {
        return Double.compare(this.price, x.price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
