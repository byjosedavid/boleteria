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
        System.out.println("El valor total es: " + this.valorNeto);
        return valorNeto;
    }

    public Grupo1() {
    }

    public Grupo1(String nombre, String email, Integer id, String grupo, LocalDate fechaCompra) {
        super(nombre, email, id, grupo, fechaCompra);
    }
}
