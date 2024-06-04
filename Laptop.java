package org.example;

public class Laptop implements IProducto {
    private String nombre;
    private String marca;

    private double precio;

    private int añosGarantia;


    //Definir constructor

    public Laptop ( String nombre , String marca , double precio , int añosGarantia){
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.añosGarantia = añosGarantia;
    }

    @Override
    public String getModelo(){
        return nombre;
    }

    @Override
    public String getMarca(){
        return marca;

    }

    @Override
    public double getPrecio(){
        return precio;
    }

    @Override
    public void imprimeDetallesProducto() {
        System.out.println("Laptop: "+nombre + "Marca: "+marca + "Precio: "+precio + "Años de Garantia: "+añosGarantia);
    }

    public int getAñosGarantia(){
        return añosGarantia;
    }
}
