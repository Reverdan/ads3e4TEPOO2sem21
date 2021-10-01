package com.example.temperatura.modelo;

import java.text.DecimalFormat;

public class Conversao
{
    private Double temperatura;
    private String tipo;

    public Conversao(Double temperatura, String tipo)
    {
        this.temperatura = temperatura;
        this.tipo = tipo;
        converter();
    }

    private void converter()
    {
        if (this.tipo.equals("CF"))
        {
            // fahrenheit = Celsius * 1.8 + 32
            this.temperatura = this.temperatura * 1.8 + 32;
        }
        else
        {
            // Celsius = (fahrenheit - 32) / 1.8
            this.temperatura = (this.temperatura - 32) / 1.8;
        }
    }

    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(this.temperatura);
    }
}
