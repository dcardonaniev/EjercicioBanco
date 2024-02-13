package me.davidlake;

public class Cobrador extends Cliente{

    public Cobrador(
            String nombre,
            String tipoCliente
    ) {
        super(nombre, tipoCliente);
    }

    @Override
    public void movimiento(String movimiento) {
        switch (movimiento.toLowerCase()) {
            case "retiro":
            case "consulta":
                super.transaccionExitosa(movimiento);
                break;
            default:
                super.transaccionFallida(movimiento);
        }
    }
}
