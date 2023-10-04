package org.example;

public class Compra extends Cartao{
    private String nomeDaCompra;
    private Double valorDaCompra;

    public String getNomeDaCompra() {
        return nomeDaCompra;
    }

    public void setNomeDaCompra(String nomeDaCompra) {
        this.nomeDaCompra = nomeDaCompra;
    }

    public Double getValorDaCompra() {
        return valorDaCompra;
    }

    public void setValorDaCompra(Double valorDaCompra) {
        this.valorDaCompra = valorDaCompra;
    }

    @Override
    public String toString() {
        return  nomeDaCompra + " - " + valorDaCompra;
    }
}
