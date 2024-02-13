package me.davidlake;

public abstract class Cliente implements Transaccion {
    String nombre;
    String tipoCliente;

    public Cliente(
            String nombre,
            String tipoCliente
    ) {
        this.nombre = nombre;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public void transaccionExitosa(String metodo) {
        System.out.println(metodo + " (Exitoso)");
    }

    @Override
    public void transaccionFallida(String metodo) {
        System.out.println(metodo + " (Fallido)");
    }

    public abstract void movimiento(String movimiento);
}
