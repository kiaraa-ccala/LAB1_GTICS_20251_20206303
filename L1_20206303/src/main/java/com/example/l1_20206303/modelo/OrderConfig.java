package com.example.l1_20206303.modelo;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class OrderConfig {

    private String nombre;
    private String mesa;
    private List<Product> products = new ArrayList<>();
    private double total;

    public enum ProductType{
        cafe,
        te,
        postres;
    }

    public enum Size{
        pequenio,
        mediano,
        grande;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;

    }
    public String getMesa() {
        return mesa;
    }
    public void setMesa(String mesa) {
        this.mesa = mesa;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;

    }
    public ProductType getProductType() {
        return ProductType.te;

    }
    public Size getSize() {
        return Size.pequenio;
    }


}

