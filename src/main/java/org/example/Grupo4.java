package org.example;

import java.time.LocalDate;
import java.util.Scanner;

// Sin Abono
public class Grupo4 extends Hincha {
    private final Double valorDescuento = 0.0;
    private final Double costoBoleta = 80000d;
    private Double valorBruto = 0d;
    private Double valorDescuentoTribuna;
    private Double valorDescuentoFecha;
    private Double valorIva;
    private Double valorNeto;

    @Override
    public Double calcularValorBruto(Integer cantidad) {
        Double precioPopular = 40000d;
        Double precioOriental = 80000d;
        Double precioOccidental = 150000d;
        Scanner sc = new Scanner(System.in);
        if (cantidad > 5) {
            System.out.print("Error, No puede comprar mas de 5 boletas");
        } else {
            for (int i = 1; i < cantidad + 1; i++) {
                System.out.println("Ingrese el tipo de tribuna para la boleta " + i + " (Popular:1, Oriental:2, Occidental:3)");
                int tribuna = sc.nextInt();
                switch (tribuna) {
                    case 1 -> this.valorBruto += precioPopular;
                    case 2 -> this.valorBruto += precioOriental;
                    case 3 -> this.valorBruto += precioOccidental;
                    default -> System.out.println("Error, Ingrese un valor valido");
                }
            }
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
        this.valorNeto = this.valorBruto - this.valorDescuentoFecha + this.valorIva;
        System.out.println(" El valor total es: " + this.valorNeto);
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


    public Grupo4() {
    }

    public Grupo4(String nombre, String email, Integer id, String grupo, LocalDate fechaCompra) {
        super(nombre, email, id, grupo, fechaCompra);
    }
}
