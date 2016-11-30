package iswtp5.model;
import java.util.ArrayList;
public class Regla3 implements IRegla{
        private static final double porcentaje = 0.3d;
        @Override
        public double RealizarDescuento(Venta venta){
            double descuento = 0;
            ArrayList<ProductoDescuento> productos = new ArrayList<>();
            for (LineaVenta Detalle : venta.Detalle()) {
                if ("Lacteos".equals(Detalle.Producto.Rubro.Descripcion) 
                        || "Verduras".equals(Detalle.Producto.Rubro.Descripcion))//cambio del operador logico && por ||  
                {
                    
                    boolean existe = true; // igual true
                    if (existe) //cambio de lugar del if  
                    {
                        
                        productos.add(new ProductoDescuento(Detalle.Producto));
                    }
                    for (ProductoDescuento productoDescuento : productos) {
                        if (productoDescuento.Producto.Codigo == Detalle.Producto.Codigo)//  cambio de la negacion 
                        {
                            existe = true;
                            productoDescuento.Cantidad += Detalle.Cantidad;
                            break;
                        }
                    }
                    
                }
            }

            for(ProductoDescuento productoDescuento : productos)
            {
                if (productoDescuento.Cantidad == 2)
                {
                    System.out.println("sgs");
                    descuento += productoDescuento.Producto.Precio * porcentaje;
                }
                else if (productoDescuento.Cantidad > 2 && productoDescuento.Cantidad <= 5)
                {
                    descuento += productoDescuento.Producto.Precio * (productoDescuento.Cantidad-1) * porcentaje; // cambio de la operacion 
                }
                else if(productoDescuento.Cantidad >5) //se agrega condicion para restringir en caso de cantidad <2
                {
                    descuento += productoDescuento.Producto.Precio * 4 * porcentaje;
                }
            }
            return descuento;
        }
    }
