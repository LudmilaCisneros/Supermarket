package com.supermarket;

import entities.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> productos = cargarProductos();
        mostrarProductos(productos);
        mostrarProductoMasCaro(productos);
        mostrarProductoMasBarato(productos);
    }
    private static List<Product> cargarProductos() {
        List<Product> productos = new ArrayList<>();
        productos.add(new PorLitros("Coca-Cola Zero", 20, 1.5));
        productos.add(new PorLitros("Coca-Cola", 18, 1.5));
        productos.add(new PorMiliLitros("Shampoo Sedal", 19, 500));
        productos.add(new PorKilos("Frutillas", 64));
        return productos;
    }
    private static void mostrarProductos(List<Product> productos) {
        for (Product producto : productos) {
            System.out.println(producto.toString());
        }
        System.out.println("=============================");
    }

    private static void mostrarProductoMasCaro(List<Product> productos) {
        Product masCaro = Collections.max(productos);
        System.out.println("Producto más caro: " + masCaro.getName());
    }

    private static void mostrarProductoMasBarato(List<Product> productos) {
        Product masBarato = Collections.min(productos);
        System.out.println("Producto más barato: " + masBarato.getName());
    }
}
