package com.example.variasactivities.modelo;

public class CalculoPrimo
{
    private Integer n1;
    private String resultado;

    public CalculoPrimo(Integer n1)
    {
        this.n1 = n1;
        this.calcular();
    }

    private void calcular()
    {
        this.resultado = "É primo";
        for (int i = 2; i < this.n1 / 2 + 1; i++)
        {
            if (this.n1 % i == 0)
            {
                this.resultado = "Não é primo";
                break;
            }
        }
    }

    @Override
    public String toString()
    {
        return resultado;
    }
}
