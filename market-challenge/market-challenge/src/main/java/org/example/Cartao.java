package org.example;

public class Cartao implements Comparable<Compra>{
    private Compra compra;

    @Override
    public int compareTo(Compra outraCompra) {
        return this.compra.getValorDaCompra().compareTo(outraCompra.getValorDaCompra());
    }
}
