package org.example;

import java.time.LocalDate;

// Abonados Popular
public class Grupo1 extends Hincha {
    private final Double valorDescuento = 0.35;
    private final Double costoBoleta = 40000d;
    private Double valorBruto;
    private Double valorDescuentoTribuna;
    private Double valorDescuentoFecha;
    private Double valorIva;
    private Double valorNeto;

    public Grupo1(LocalDate of) {
    }


    @Override
    public Double calcularValorBruto(Integer cantidad) {
        if (cantidad > 1) {
            System.out.println("Error, No puede comprar mas de una boleta");
        } else {
            this.valorBruto = costoBoleta * cantidad;
        }
        return valorBruto;
    }

    @Override
    public Double calcDescuentoTribuna() {
        this.valorDescuentoTribuna = (this.valorBruto * this.valorDescuento);
        return valorDescuentoTribuna;
    }

    @Override
    public Double calcDescuentoFecha() {
        this.valorDescuentoFecha = (this.valorBruto * this.descuentoFecha(getFechaCompra()));
        return valorDescuentoFecha;
    }

    @Override
    public Double calcIva() {
        this.valorIva = (valorBruto * getIva());
        return valorIva;
    }

    @Override
    public Double calcValorNeto() {
        this.valorNeto = this.valorBruto - this.valorDescuentoTribuna - this.valorDescuentoFecha + this.valorIva;
        return valorNeto;
    }

    @Override
    public void showInfo() {
        System.out.println();
        System.out.println(" El nombre del comprador es: " + getNombre());
        System.out.println(" El id del comprador es: " + getId());
        System.out.println(" El email del comprador es: " + getEmail());
        System.out.println(" El grupo del comprador es: " + getGrupo());
        System.out.println(" La fecha de compra es: " + getFechaCompra());
        System.out.println(" El valor total es: " + this.valorNeto);
    }

    public Double getValorNeto() {
        return valorNeto;
    }


    public Grupo1() {
    }


    public Grupo1(String nombre, String email, Integer id, String grupo, LocalDate fechaCompra) {
        super(nombre, email, id, grupo, fechaCompra);
    }


}
