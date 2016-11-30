package iswtp5.model;
public class ProductoDescuento {
    public ProductoDescuento(){}
    public ProductoDescuento(Producto producto){
        Producto = producto;
        Cantidad = 0; //cambio de 1 a 0
    }

    public Producto Producto;
    public int Cantidad;
}
