package iswtp5.model;
public class Regla2 implements IRegla
    {
        private static final double porcentaje1 = 0.03d;
        private static final double porcentaje2 = 0.05d;
        private static final double porcentaje3 = 0.065d;
        @Override
        public double RealizarDescuento(Venta venta)
        {
            
            double total = venta.Total();
            if (total > 500 && total <= 1000) //correcion del signo < 1000 a <= 1000
            {
                return total * porcentaje1;
            }
            if (total > 1000 && total <= 2500)// correccion del signo 
            {
                return total * porcentaje2;
            }
            else 
            { if(total>2500){
                return total * porcentaje3;} // cambio del numero del porcentaje 
            }

        return 0;}
    }
