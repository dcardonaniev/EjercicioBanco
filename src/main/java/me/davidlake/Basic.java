package me.davidlake;

public class Basic extends Cliente {
    public Basic(String nombre, String tipoCliente) {
        super(nombre, tipoCliente);
    }

    @Override
    public void movimiento(String movimiento) {
        switch (movimiento.toLowerCase()) {
            case "consulta":
            case "retiro":
            case "pago":
                super.transaccionExitosa(movimiento);
                break;
            default:
                super.transaccionFallida(movimiento);
        }
    }

}