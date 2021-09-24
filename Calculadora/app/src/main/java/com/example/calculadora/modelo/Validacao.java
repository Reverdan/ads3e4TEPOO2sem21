package com.example.calculadora.modelo;

import android.content.Context;

import com.example.calculadora.R;

public class Validacao
{
    private Double n1;
    private Double n2;
    private String mensagem;
    private String op;
    private Context context;

    public void validar(String num1, String num2, String op, Context context)
    {
        this.mensagem = "";
        this.op = op;
        this.context = context;
        try
        {
            this.n1 = Double.parseDouble(num1);
            this.n2 = Double.parseDouble(num2);
            this.validarDivisao();
        }
        catch (NumberFormatException e)
        {
//            this.mensagem = "Digite valores válidos";
            this.mensagem = context.getString(R.string.numero_invalido);
        }
    }

    private void validarDivisao()
    {
        if (op.equals("/") && this.n2.equals(0.0))
        {
//            this.mensagem = "Divisão por 0";
            this.mensagem = context.getString(R.string.divisao_zero);
        }
    }

    public Double getN1()
    {
        return n1;
    }

    public void setN1(Double n1)
    {
        this.n1 = n1;
    }

    public Double getN2()
    {
        return n2;
    }

    public void setN2(Double n2)
    {
        this.n2 = n2;
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }
}
