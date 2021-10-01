package com.example.temperatura.modelo;

public class Controle
{
    private String mensagem;
    private String temp;
    private String tipo;

    public Controle(String temp, String tipo)
    {
        this.temp = temp;
        this.tipo = tipo;
        executar();
    }

    private void executar()
    {
        this.mensagem = "";
        Validacao validacao = new Validacao(this.temp);
        if (validacao.getMensagem().equals(""))
        {
            Conversao conversao = new Conversao(validacao.getTemperatura(), this.tipo);
            this.temp = conversao.toString();
        }
        else
        {
            this.mensagem = validacao.getMensagem();
        }
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public String getTemp()
    {
        return temp;
    }
}
