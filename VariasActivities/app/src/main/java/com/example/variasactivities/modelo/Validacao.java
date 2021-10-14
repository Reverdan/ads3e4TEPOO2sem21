package com.example.variasactivities.modelo;

public class Validacao
{
    private String num1;
    private Integer n1;
    private String mensagem;

    public Validacao(String num1)
    {
        this.num1 = num1;
        this.executar();
    }

    private void executar()
    {
        this.mensagem = "";
        try
        {
            this.n1 = Integer.parseInt(this.num1);
        }
        catch (NumberFormatException e)
        {
            this.mensagem = "Digite números válidos";
        }
    }

    public Integer getN1()
    {
        return n1;
    }

    public String getMensagem()
    {
        return mensagem;
    }
}
