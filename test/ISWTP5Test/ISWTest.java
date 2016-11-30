/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISWTP5Test;
import iswtp5.model.DiaSemana;
import iswtp5.model.Negocio;
import iswtp5.model.Regla2;
import iswtp5.model.Venta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Planos
 */
public class ISWTest {
    
    public ISWTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Negocio.Iniciar();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void comprobarRegla2ValoresEntre500Y1000Descuento3PorCiento(){
      //Configuración
      Venta venta;
      venta = new Venta();
      venta.AgregarDetalle(Negocio.Productos()[0], 10);
      venta.AgregarDetalle(Negocio.Productos()[1], 1);
      venta.AgregarDetalle(Negocio.Productos()[2],1);
      Regla2 regla2 = new Regla2();
      double descuento =0;
      
      //Ejecución
      descuento = regla2.RealizarDescuento(venta);
      
      //Validación
        assertEquals(17.1, descuento, 0.01);
    }
    
    @Test
    public void comprobarRegla2ValoresEntre1000Y2500Descuento3PorCiento(){
      //Configuración
      Venta venta;
      venta = new Venta();
      venta.AgregarDetalle(Negocio.Productos()[0], 40);
      venta.AgregarDetalle(Negocio.Productos()[1], 1);
      venta.AgregarDetalle(Negocio.Productos()[2],1);
      Regla2 regla2 = new Regla2();
      double descuento =0;
      
      //Ejecución
      descuento = regla2.RealizarDescuento(venta);
      
      //Validación
        assertEquals(103.5, descuento, 0.01);
    }
  
    @Test
    public void comprobarRegla2ValoresMayores2500Descuento6yMedioPorCiento(){
        //Configuración
      Venta venta;
      venta = new Venta();
      venta.AgregarDetalle(Negocio.Productos()[0], 80);
      venta.AgregarDetalle(Negocio.Productos()[1], 1);
      venta.AgregarDetalle(Negocio.Productos()[2],1);
      Regla2 regla2 = new Regla2();
      double descuento =0;
      
      //Ejecución
      descuento = regla2.RealizarDescuento(venta);
      
      //Validación
        assertEquals(264.55, descuento, 0.01);
    }
    
    
    //Pruebas de unidad de la regla 1
    @Test
    public void comprobarRegla1TresProductosIgualesDePanaderia(){
    
    //Configuracion
    Venta venta = new Venta();
    venta.AgregarDetalle(Negocio.Productos()[0], 3);
   
    //Ejecucion
     venta.CalcularDescuentos(DiaSemana.Lunes);
        
    //Validacion
        assertEquals(50, venta.Descuento(), 0);
    
    }
}
