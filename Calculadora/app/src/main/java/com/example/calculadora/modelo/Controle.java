package com.example.calculadora.modelo;

import android.content.Context;

public class Controle
{
    private String num1;
    private String num2;
    private String op;
    private String mensagem;
    private String result;
    private Context contexto;

    public Controle(String num1, String num2, String op, Context contexto)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
        this.contexto = contexto;
        this.executar();
    }

    private void executar()
    {
        this.mensagem = "";
        Validacao validacao = new Validacao(contexto);
        validacao.validar(this.num1, this.num2, this.op);
        if (validacao.getMensagem().equals(""))
        {
            Calculos calculos = new Calculos(validacao.getN1(),
                    validacao.getN2(), this.op);
            this.result = calculos.toString();
        }
        else
        {
            this.mensagem = validacao.getMensagem();
        }
    }

    @Override
    public String toString()
    {
        return result;
    }

    public String getMensagem()
    {
        return mensagem;
    }
}
