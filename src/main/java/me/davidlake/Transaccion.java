package me.davidlake;

public interface Transaccion {
    public void transaccionExitosa(String metodo);
    public void transaccionFallida(String metodo);
}

