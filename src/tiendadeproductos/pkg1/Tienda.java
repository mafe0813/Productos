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
    public class Tienda {
    
    private Productos p1;
    private Productos p2;
    private Productos p3;
    private Productos p4;
    
    public Tienda (){
       
       p1=new Productos();
       p2=new Productos();
       p3=new Productos();
       p4=new Productos();
   }
    
    public Productos getP1() {
        return p1;
    }

    public void setP1(Productos p1) {
        this.p1 = p1;
    }

    public Productos getP2() {
        return p2;
    }

    public void setP2(Productos p2) {
        this.p2 = p2;
    }

    public Productos getP3() {
        return p3;
    }

    public void setP3(Productos p3) {
        this.p3 = p3;
    }

    public Productos getP4() {
        return p4;
    }

    public void setP4(Productos p4) {
        this.p4 = p4;
    }

    public double calculardineroencaja(){
        double dineroencaja = (p1.getTotalunidadesVendidas() * p1.getValorunitario() * (1 + Productos.IVA_PAPEL)
                + p2.getTotalunidadesVendidas() * p2.getValorunitario() * (1 + Productos.IVA_MERCADO)
                +p3.getTotalunidadesVendidas() * p3.getValorunitario() * (1 + Productos.IVA_MERCADO)
                +p4.getTotalunidadesVendidas() * p4.getValorunitario() * (1 + Productos.IVA_FARMACIA));
        return dineroencaja;
    }
    
     public boolean promediovendidoybodega(){
         boolean unpromediovendidoybodega  = (p1.getTotalunidadesVendidas() + p2.getTotalunidadesVendidas() + p3.getTotalunidadesVendidas() + p4.getTotalunidadesVendidas() / 4 
                 > p1.getCantitadbodega() + p2.getCantitadbodega() + p3.getCantitadbodega() + p4.getCantitadbodega() / 4 );
         return unpromediovendidoybodega;
    }
    
     //¿La cantidad mínima del producto 4 es  una quinta parte de la cantidad de  productos vendidos?
     
     public boolean minima4es5deprocutosvendidos(){
         boolean unminima4es5deprocutosvendidos = (p4.getCantidadMinimo() ==
                 p1.getTotalunidadesVendidas() + p2.getTotalunidadesVendidas() + p3.getTotalunidadesVendidas() + p4.getTotalunidadesVendidas() / 5 );
         return unminima4es5deprocutosvendidos;
     }
    
}

