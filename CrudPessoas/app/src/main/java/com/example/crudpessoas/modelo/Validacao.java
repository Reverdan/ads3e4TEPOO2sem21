package com.example.crudpessoas.modelo;

import java.util.List;

public class Validacao
{
    private String mensagem;
    private Integer id;

    public void validarDadosPessoa(List<String> listaDadosPessoa)
    {
        this.mensagem = "";
        if (listaDadosPessoa.get(0).length() < 3)
            this.mensagem += "Nome com menos que 3 caracteres \n";
        if (listaDadosPessoa.get(0).length() > 20)
            this.mensagem += "Nome mais que 20 caracteres \n";
        if (listaDadosPessoa.get(1).length() > 15)
            this.mensagem += "RG com mais de 15 caracteres \n";
        if (listaDadosPessoa.get(2).length() > 15)
            this.mensagem += "CPF com mais de 15 caracteres \n";
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public Integer getId()
    {
        return id;
    }
}
