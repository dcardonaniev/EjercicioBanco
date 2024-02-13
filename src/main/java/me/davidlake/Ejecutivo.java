package me.davidlake;

public class Ejecutivo extends Cliente {
    public Ejecutivo(
            String nombre,
            String tipoCliente
    ) {
        super(nombre, tipoCliente);
    }

    @Override
    public void movimiento(String movimiento) {
        switch (movimiento.toLowerCase()) {
            case "deposito":
            case "transferencia":
                super.transaccionExitosa(movimiento);
                break;
            default:
                super.transaccionFallida(movimiento);
        }
    }
}
