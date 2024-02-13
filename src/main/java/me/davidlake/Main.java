package me.davidlake;

public class Main {
    public static void main(String[] args) {
        Cliente pruebaBasico = new Basic(
                "David",
                "Basic"
        ), pruebaCobrador = new Cobrador(
                "Batman",
                "Cobrador"
        ), pruebaEjecutivo = new Ejecutivo(
                "Mariana",
                "Ejecutivo"
        );

        System.out.println("==================== TRANSACCIONES BASIC ====================");
        pruebaBasico.movimiento("retiro");
        pruebaBasico.movimiento("consulta");
        pruebaBasico.movimiento("deposito");
        pruebaBasico.movimiento("pago");
        pruebaBasico.movimiento("transferencia");

        System.out.println("==================== TRANSACCIONES COBRADOR ====================");
        pruebaCobrador.movimiento("retiro");
        pruebaCobrador.movimiento("consulta");
        pruebaCobrador.movimiento("deposito");
        pruebaCobrador.movimiento("pago");
        pruebaCobrador.movimiento("transferencia");

        System.out.println("==================== TRANSACCIONES EJECUTIVO ====================");
        pruebaEjecutivo.movimiento("retiro");
        pruebaEjecutivo.movimiento("consulta");
        pruebaEjecutivo.movimiento("deposito");
        pruebaEjecutivo.movimiento("pago");
        pruebaEjecutivo.movimiento("transferencia");
    }
}