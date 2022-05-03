package model;

import org.jetbrains.annotations.NotNull;

public class Bonus {
    @NotNull
    private String tipo;
    private double valor;

    public Bonus(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Bonus{" +
                "tipo='" + tipo + '\'' +
                ", valor=" + valor +
                '}';
    }
}
