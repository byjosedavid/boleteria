package org.example;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grupo;
        Double valorBruto;
        Double valorDescuentoTribuna;
        Double valorDescuentoFecha;
        Double valorIva;
        Double valorNeto;

        System.out.println("Ingrese el grupo G1 - G2 - G3 - G4: ");
        grupo = sc.next();

        if (Objects.equals(grupo, "G1")) {
            Grupo1 dato = new Grupo1("Manuel", "manuel@gmail.com", 01, "G1", LocalDate.of(2023, 3, 21));
            valorBruto = dato.calcularValorBruto(1);
            valorDescuentoTribuna = dato.calcDescuentoTribuna();
            valorDescuentoFecha = dato.calcDescuentoFecha();
            valorIva = dato.calcIva();
            valorNeto = dato.calcValorNeto();


        } else if (Objects.equals(grupo, "G2")) {
            Grupo2 dato = new Grupo2("Manuel", "manuel@gmail.com", 01, "G1", LocalDate.of(2023, 3, 24));
            valorBruto = dato.calcularValorBruto(2);
            valorDescuentoTribuna = dato.calcDescuentoTribuna();
            valorDescuentoFecha = dato.calcDescuentoFecha();
            valorIva = dato.calcIva();
            valorNeto = dato.calcValorNeto();

        } else if (Objects.equals(grupo, "G3")) {
            Grupo3 dato = new Grupo3();
            valorBruto = dato.calcularValorBruto(1);
            valorDescuentoTribuna = dato.calcDescuentoTribuna();
            valorDescuentoFecha = dato.calcDescuentoFecha();
            valorIva = dato.calcIva();
            valorNeto = dato.calcValorNeto();
        } else if (Objects.equals(grupo, "G4")) {
            Grupo4 dato = new Grupo4("Manuel", "manuel@gmail.com", 01, "G1", LocalDate.of(2023, 3, 21));
            int cantidad;
            System.out.println("Ingrese la cantidad de boletas: ");
            cantidad = sc.nextInt();
            valorBruto = dato.calcularValorBruto(cantidad);
            valorDescuentoTribuna = dato.calcDescuentoTribuna();
            valorDescuentoFecha = dato.calcDescuentoFecha();
            valorIva = dato.calcIva();
            valorNeto = dato.calcValorNeto();
        }


    }
}
