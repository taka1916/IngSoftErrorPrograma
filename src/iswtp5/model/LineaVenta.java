package iswtp5.model;
public class LineaVenta {
      public LineaVenta(){}

      public LineaVenta(Producto producto, int cantidad){
            Producto = producto;
            Cantidad = cantidad;
            Precio = producto.Precio;
      }

      public int Cantidad; 
      public Producto Producto;
      public double Precio;

      public double SubTotal(){
         return Precio*Cantidad; 
      }

    @Override
    public String toString() {
        return "LineaVenta{" + "Cantidad=" + Cantidad + ", Producto=" + Producto + ", Precio=" + Precio + '}';
    }
      
}
