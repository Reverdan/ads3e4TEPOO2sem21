package com.example.variasactivities.modelo;

public class Controle
{
    private String mensagem;
    private String resultado;

    public void primo(String num1)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao(num1);
        if (validacao.getMensagem().equals(""))
        {
            CalculoPrimo primo = new CalculoPrimo(validacao.getN1());
            this.resultado = primo.toString();
        }
        else
            this.mensagem = validacao.getMensagem();
    }

    public void fatorial(String num1)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao(num1);
        if (validacao.getMensagem().equals(""))
        {
            CalculoFatorial fatorial = new CalculoFatorial(validacao.getN1());
            this.resultado = fatorial.toString();
        }
        else
            this.mensagem = validacao.getMensagem();
    }

    @Override
    public String toString()
    {
        return resultado;
    }

    public String getMensagem()
    {
        return mensagem;
    }
}
