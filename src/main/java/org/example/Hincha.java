package org.example;

import java.time.LocalDate;

public abstract class Hincha {
    private String nombre;
    private String email;
    private LocalDate fechaCompra;
    private Integer id;
    private String grupo;
    private final Double iva = 0.19;

    private Double descuentoPorFecha;

    public abstract Double calcularValorBruto(Integer cantidad);

    public abstract Double calcDescuentoTribuna();
    public abstract Double calcDescuentoFecha();
    public abstract Double calcIva();
    public abstract Double calcValorNeto();


    public Double descuentoFecha(LocalDate date) {
        if (date.equals(LocalDate.of(2023, 3, 21))) {
            this.descuentoPorFecha = 0.05;
        } else if (date.equals(LocalDate.of(2023, 3, 22))) {
            this.descuentoPorFecha = 0.02;
        } else if (date.equals(LocalDate.of(2023, 3, 23))) {
            this.descuentoPorFecha = 0.015;
        } else if (date.equals(LocalDate.of(2023, 3, 24))) {
            this.descuentoPorFecha = 0.01;
        }
        return descuentoPorFecha;
    }

    public Hincha() {
    }

    public Hincha(String nombre, String email, Integer id, String grupo, LocalDate fechaCompra) {
        this.nombre = nombre;
        this.email = email;
        this.id = id;
        this.grupo = grupo;
        this.fechaCompra = fechaCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Double getIva() {
        return iva;
    }
}
