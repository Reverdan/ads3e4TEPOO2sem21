package com.example.temperatura.modelo;

public class Validacao
{
    private String mensagem;
    private Double temperatura;
    private String temp;

    public Validacao(String temp)
    {
        this.temp = temp;
        validar();
    }

    private void validar()
    {
        this.mensagem = "";
        try
        {
            this.temperatura = Double.parseDouble(this.temp);
        }
        catch (NumberFormatException e)
        {
            this.mensagem = "Digite valores válidos";
        }
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public Double getTemperatura()
    {
        return temperatura;
    }
}
