package com.example.calculadora.modelo;

import android.content.Context;

public class Controle
{
    private String num1;
    private String num2;
    private String op;
    private String mensagem;
    private String result;
    private Context context;

    public Controle(String num1, String num2, String op, Context context)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
        this.context = context;
        this.executar();
    }

    private void executar()
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validar(this.num1, this.num2, this.op, context);
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
