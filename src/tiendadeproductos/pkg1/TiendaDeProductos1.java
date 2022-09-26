/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadeproductos.pkg1;

/**
 *
 * @author SG701-02
 */
public class TiendaDeProductos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tienda mitienda = new Tienda ();
        Productos p1 = new Productos(" Libreta ", Productos.PAPELERIA, 23, 15, 5500, 87 );
        mitienda.setP1(p1);
        double R1=(p1.getValorunitario() * p1.getCantitadbodega() / p1.getCantidadMinimo());
        System.out.println("La expresion correspondiente de la libreta es de: " + R1);
        Productos p2 = new Productos(" Leche ", Productos.SUPERMERCADO, 150, 30, 2100,30 );
        mitienda.setP2(p2);
        double R2=(p2.getCantitadbodega() - p2.getCantidadMinimo());
        System.out.println("La primera expresion correspondiente de la leche es de: " + R2);
        //valor iva
        double R21=(p2.getValorunitario()* p2.getTotalunidadesVendidas() * Productos.IVA_MERCADO);
        System.out.println("La segunda expresion correspondiente de la leche es de: " + R21);
        Productos p3 = new Productos(" Jabon ", Productos.SUPERMERCADO, 15, 50,4200,80);
        mitienda.setP3(p3);
        double R3=(( p3.getTotalunidadesVendidas() + p3.getCantitadbodega()) *( p3.getValorunitario() + p3.getValorunitario() * Productos.IVA_MERCADO));
        System.out.println("La expresion correspondiente del jabon es de: " + R3);
        Productos p4 = new Productos(" Aspirina ", Productos.DROGUERIA, 60, 100,2400,200 );
        mitienda.setP4(p4);
        double R4=(p4.getValorunitario() / (p3.getCantitadbodega() * 12));
        System.out.println("La primera expresion correspondiente  de la aspirina es de: " + R4);
        double R41=(p4.getValorunitario() * (1 + Productos.IVA_FARMACIA) * p4.getTotalunidadesVendidas() / p4.getCantitadbodega());
        System.out.println("La segunda expresion correspondiente  de la aspirina es de: " + R41);
        //promedio
        double tienda1 = (p1.getValorunitario() + p2.getValorunitario() + p3.getValorunitario() + p4.getValorunitario() / 4);
        System.out.println("la primera expresion de la tienda (promedio) : " + tienda1);
        double tienda2 = ((p1.getCantitadbodega() - p1.getCantidadMinimo()) * (p1.getValorunitario() * (1 + Productos.IVA_PAPEL)));
        System.out.println("la segunda espresion de la tienda es de: " + tienda2);
        double dineroencaja;
        dineroencaja = (mitienda.calculardineroencaja() - (p2.getCantidadMinimo() * p2.getValorunitario()));
        System.out.println("El dinero en la caja es de: " + dineroencaja);
        double tienda3 = (p3.getTotalunidadesVendidas() * (1 + Productos.IVA_MERCADO));
        System.out.println("la tercera expresion de la tienda es de: " + tienda3);
        
        
        // Expresiones con operadores relacionales 
        
       // System.out.println("la expresion: cantidadbodega >= 2cantidadminima");
        //System.out.println(p1.getCantitadbodega() >= 2 * p1.getCantidadMinimo());
        System.out.println("***********************************************************");
        System.out.println("La expresion de: Tipo es igual a PAPELERIA de la libreta es: " +(p1.getTipo() == Productos.PAPELERIA));
        System.out.println("La expresion de: Tipo no es igual a DROGUERIA  de la libreta es: " +(p1.getTipo() != Productos.DROGUERIA));
        System.out.println("La expresion de: CantidadMinima es mayor o igual a cantidadBodega de la leche es: " 
                +(p2.getCantidadMinimo() >= p2.getCantitadbodega()));
        System.out.println("La expresion de: ValorUnitario es menor o igual a 10000 del jabon es: " 
                +(p3.getValorunitario() <= 1000 ));
        System.out.println("La expresion de: cantidadBodega menos la cantidadMinima no es igual a el totalProductosVendidos de la aspirina es: "
                + (p4.getCantitadbodega() - p4.getCantidadMinimo() != p4.getTotalunidadesVendidas()));
        System.out.println("La expresion de: cantidadBodega por valorUnitario es igual a totalProductosVendidos por el IVA_PAPEL  del jabon es: "
                +(p3.getCantitadbodega() * p3.getValorunitario() == p3.getTotalunidadesVendidas() * Productos.IVA_MERCADO));
        System.out.println("La expresion de: la suma de los productos vendidos de la libreta y la leche es mayor a la cantidad de productos vendidos del jabon es: "
                +(p1.getTotalunidadesVendidas() + p2.getTotalunidadesVendidas() > p3.getTotalunidadesVendidas()));
        System.out.println("La expresion de: el dinero en caja es menos que laa unidades vendidasde la aspirina  *  1 + el iva del producto por su valor unitario es:  " 
                + (mitienda.calculardineroencaja() <= p4.getTotalunidadesVendidas() * (1+ Productos.IVA_FARMACIA)* p4.getValorunitario()));
        System.out.println("La expresion de: la suma de la cantidad en bodega de cada uno de los productos es menor que 1000 es: "
                + (p1.getCantitadbodega()+ p2.getCantitadbodega() + p3.getCantitadbodega() + p4.getCantitadbodega() <= 1000));
        System.out.println("La expresion de: el dinero en la caja por el iva de la " + p1.getNombre() + "es menor que la multiplicacion de las unidades vendidas y el valor dela libreta es: " + (mitienda.calculardineroencaja() * Productos.IVA_PAPEL > p1.getTotalunidadesVendidas() * p1.getValorunitario()));
        
        System.out.println("***********************************************************");
        System.out.println("Para"+ p1.getNombre()+ "¿La cantidad de bodega es el doble de a cantidad  minima?:  " + p1.cantidadactualdoblecantidadminima());
        System.out.println("Para"+ p2.getNombre()+ "¿La cantidad de bodega es el doble de a cantidad  minima?:  " + p2.cantidadactualdoblecantidadminima());
        System.out.println("Para"+ p3.getNombre()+ "¿La cantidad de bodega es el doble de a cantidad  minima?:  " + p3.cantidadactualdoblecantidadminima());
        System.out.println("Para"+ p4.getNombre()+ "¿La cantidad de bodega es el doble de a cantidad  minima?:  " + p4.cantidadactualdoblecantidadminima());
        System.out.println("***********************************************************");
        System.out.println("Para"+ p1.getNombre()+ "¿El total de productos vendidos, es  igual a la cantidad en bodega?  " + p1.igualdadprocutosybodega());
        System.out.println("Para"+ p2.getNombre()+ "¿El total de productos vendidos, es  igual a la cantidad en bodega?  " + p2.igualdadprocutosybodega());
        System.out.println("Para"+ p3.getNombre()+ "¿El total de productos vendidos, es  igual a la cantidad en bodega?  " + p3.igualdadprocutosybodega());
        System.out.println("Para"+ p4.getNombre()+ "¿El total de productos vendidos, es  igual a la cantidad en bodega?  " + p4.igualdadprocutosybodega());
        System.out.println("***********************************************************");
         System.out.println("¿El tipo de" + p1.getNombre() + "de tipo " + p1.getTipo() + " no hace parte de la papeleria? " + p1.tipopapeleria());
        System.out.println("¿El tipo de" + p2.getNombre() +  "de tipo " + p2.getTipo() +  " no hace parte de la papeleria? " + p2.tipopapeleria());
        System.out.println("¿El tipo de" + p3.getNombre() +  "de tipo " + p3.getTipo() + " no hace parte de la papeleria? " + p3.tipopapeleria());
        System.out.println("¿El tipo de" + p4.getNombre() +  "de tipo " + p4.getTipo() + " no hace parte de la papeleria? " + p4.tipopapeleria());
        System.out.println("***********************************************************");
        System.out.println("¿La cantidad mínima del producto 4 es  una quinta parte de la cantidad de  productos vendidos?  " + mitienda.minima4es5deprocutosvendidos());
        System.out.println("¿El promedio de unidades vendidas de  todos los productos es mayor al  promedio de unidades en bodega de  todos los productos? " + mitienda.promediovendidoybodega());
        System.out.println("***********************************************************");
        System.out.println("***********************************************************");
        
        
    }
    
}
