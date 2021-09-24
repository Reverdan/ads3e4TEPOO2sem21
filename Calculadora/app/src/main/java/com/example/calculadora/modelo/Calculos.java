package com.example.calculadora.modelo;

public class Calculos
{
    private Double n1;
    private Double n2;
    private String op;
    private Double resultado;

    public Calculos(Double n1, Double n2, String op)
    {
        this.n1 = n1;
        this.n2 = n2;
        this.op = op;
        this.calcular();
    }

    private void calcular()
    {
        if (op.equals("+")) this.resultado = this.n1 + this.n2;
        if (op.equals("-")) this.resultado = this.n1 - this.n2;
        if (op.equals("*")) this.resultado = this.n1 * this.n2;
        if (op.equals("/")) this.resultado = this.n1 / this.n2;
    }

    @Override
    public String toString()
    {
        return this.resultado.toString();
    }
}
