package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tienda implements ITienda {
    private List<IProducto> productos;

    public Tienda() {
        this.productos = new ArrayList<>();
    }


    //Implementar los métodos

    @Override
    public void agregarProducto(IProducto producto) {
        productos.add(producto);
    }

    @Override
    public void listarProductos() {
        for (IProducto producto : productos) {

            producto.imprimeDetallesProducto();
        }
    }


    @Override
    public double obtenerPromedioPrecioProductos() {
    double total = 0 ;
    for ( IProducto producto : productos) {
        total += producto.getPrecio();
    }
     return productos.size() > 0 ? total / productos.size() : 0;


}

    @Override
    public IProducto obtenerProductoMasCostoso() {
    if (productos.isEmpty()) {
        return null;
    }
    IProducto masCostoso = productos.get(0);
    for (IProducto producto : productos) {
        if (producto.getPrecio() > masCostoso.getPrecio()) {
            masCostoso = producto;
        }
    }
    return masCostoso;
}





    //Punto extra. El valor a buscar puede ser parte del nombre.
    public Boolean buscarProductoPorNombre(String nombre) {
    //Implementar metodo

        for (IProducto producto : productos) {
            if (producto.getModelo().contains(nombre)) {
                return true;
            }
        }
        return false;
    }
}




