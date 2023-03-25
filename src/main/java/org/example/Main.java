package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double valorBruto;
        Double valorDescuentoTribuna;
        Double valorDescuentoFecha;
        Double valorIva;
        Double valorNeto;
        String grupo;
        do {
            System.out.println("Ingrese el grupo G1 - G4: ");
            grupo = sc.next();
        } while (!(grupo.equals("G1") || grupo.equals("G2") || grupo.equals("G3") || grupo.equals("G4")));

        System.out.println("Ingrese el id: ");
        Integer id = sc.nextInt();
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.next();
        System.out.println("Ingrese el email: ");
        String email = sc.next();
        System.out.println("Ingrese el dia de compra (21 - 24): ");
        int dia = sc.nextInt();
        System.out.println("Ingrese la cantidad de boletas: ");
        Integer cantidad = sc.nextInt();

        switch (grupo) {
            case "G1" -> {
                Grupo1 dato = new Grupo1();
                dato.setNombre(nombre);
                dato.setEmail(email);
                dato.setId(id);
                dato.setGrupo(grupo);
                dato.setFechaCompra(LocalDate.of(2023, 3, dia));
                valorBruto = dato.calcularValorBruto(cantidad);
                valorDescuentoTribuna = dato.calcDescuentoTribuna();
                valorDescuentoFecha = dato.calcDescuentoFecha();
                valorIva = dato.calcIva();
                valorNeto = dato.calcValorNeto();
                dato.showInfo();
            }
            case "G2" -> {
                Grupo2 dato = new Grupo2();
                dato.setNombre(nombre);
                dato.setEmail(email);
                dato.setId(id);
                dato.setGrupo(grupo);
                dato.setFechaCompra(LocalDate.of(2023, 3, dia));
                valorBruto = dato.calcularValorBruto(cantidad);
                valorDescuentoTribuna = dato.calcDescuentoTribuna();
                valorDescuentoFecha = dato.calcDescuentoFecha();
                valorIva = dato.calcIva();
                valorNeto = dato.calcValorNeto();
                dato.showInfo();
            }
            case "G3" -> {
                Grupo3 dato = new Grupo3();
                dato.setNombre(nombre);
                dato.setEmail(email);
                dato.setId(id);
                dato.setGrupo(grupo);
                dato.setFechaCompra(LocalDate.of(2023, 3, dia));
                valorBruto = dato.calcularValorBruto(cantidad);
                valorDescuentoTribuna = dato.calcDescuentoTribuna();
                valorDescuentoFecha = dato.calcDescuentoFecha();
                valorIva = dato.calcIva();
                valorNeto = dato.calcValorNeto();
                dato.showInfo();
            }
            case "G4" -> {
                Grupo4 dato = new Grupo4();
                dato.setNombre(nombre);
                dato.setEmail(email);
                dato.setId(id);
                dato.setGrupo(grupo);
                dato.setFechaCompra(LocalDate.of(2023, 3, dia));
                valorBruto = dato.calcularValorBruto(cantidad);
                valorDescuentoTribuna = dato.calcDescuentoTribuna();
                valorDescuentoFecha = dato.calcDescuentoFecha();
                valorIva = dato.calcIva();
                valorNeto = dato.calcValorNeto();
                dato.showInfo();
            }
        }
    }
}
