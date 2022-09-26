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
    
    public class Productos {

    //Constantes en public
    public final static int PAPELERIA = 1;
    public final static int SUPERMERCADO = 2;
    public final static int DROGUERIA = 3;

    public final static double IVA_PAPEL = 0.16;
    public final static double IVA_FARMACIA = 0.12;
    public final static double IVA_MERCADO = 0.04;
    public final static double IVA_VEINTICINCO = 0.25;

    //Atributos
    private String nombre;
    private int tipo;
    private int cantitadbodega;
    private int cantidadMinimo;
    private double valorunitario;
    private int totalunidadesVendidas;

    //construstor
    public Productos() {

    }

    public Productos(String nombre, int tipo, int cantitadbodega, int cantidadMinimo, double valorunitario, int totalunidadesVendidas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantitadbodega = cantitadbodega;
        this.cantidadMinimo = cantidadMinimo;
        this.valorunitario = valorunitario;
        this.totalunidadesVendidas = totalunidadesVendidas;
    }

    //metodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCantitadbodega() {
        return cantitadbodega;
    }

    public void setCantitadbodega(int cantitadbodega) {
        this.cantitadbodega = cantitadbodega;
    }

    public int getCantidadMinimo() {
        return cantidadMinimo;
    }

    public void setCantidadMinimo(int cantidadMinimo) {
        this.cantidadMinimo = cantidadMinimo;
    }

    public double getValorunitario() {
        return valorunitario;
    }

    public void setValorunitario(double valorunitario) {
        this.valorunitario = valorunitario;
    }

    public int getTotalunidadesVendidas() {
        return totalunidadesVendidas;
    }

    public void setTotalunidadesVendidas(int totalunidadesVendidas) {
        this.totalunidadesVendidas = totalunidadesVendidas;
    }

    public void venderProducto(int productosvendidos) {
        this.cantitadbodega = this.cantitadbodega - productosvendidos;
        this.totalunidadesVendidas = this.totalunidadesVendidas + productosvendidos;
    }

    public boolean cantidadactualdoblecantidadminima() {
        return this.cantitadbodega >= 2 * this.cantidadMinimo;
    }

    public boolean igualdadprocutosybodega() {
        return this.totalunidadesVendidas == this.cantitadbodega;
    }

    public boolean tipopapeleria(){
        return this.tipo != Productos.PAPELERIA;
    }
}
