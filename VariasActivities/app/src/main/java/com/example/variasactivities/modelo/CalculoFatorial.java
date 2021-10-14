package com.example.variasactivities.modelo;

public class CalculoFatorial
{
    private Integer n1;
    private String resultado;

    public CalculoFatorial(Integer n1)
    {
        this.n1 = n1;
        calcular();
    }

    private void calcular()
    {
        int base = this.n1;
        for (int i = 1; i < base; i++)
        {
            this.n1 *= i;
        }
        if (base == 0) this.resultado = "1";
        else this.resultado = this.n1.toString();
    }

    @Override
    public String toString()
    {
        return resultado;
    }
}
