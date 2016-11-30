package iswtp5.model;
public class Producto {
    public Producto()
        {
            
        }
        public Producto(int codigo, String descripcion, double precio, Rubro rubro)
        {
            Codigo = codigo;
            Descripcion = descripcion;
            Precio = precio;
            Rubro = rubro;
        }
        public int Codigo;
        public String Descripcion;
        public double Precio;
        public Rubro Rubro;

    @Override
    public String toString() {
        return "Producto{" + "Codigo=" + Codigo + ", Descripcion=" + Descripcion + ", Precio=" + Precio + ", Rubro=" + Rubro + '}';
    }
        
        
}
