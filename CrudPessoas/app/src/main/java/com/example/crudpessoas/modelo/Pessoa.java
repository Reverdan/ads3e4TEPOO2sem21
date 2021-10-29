package com.example.crudpessoas.modelo;

public class Pessoa
{
    private Integer id;
    private String nome;
    private String rg;
    private String cpf;

    public Pessoa()
    {

    }

    public Pessoa(Integer id, String nome, String rg, String cpf)
    {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getRg()
    {
        return rg;
    }

    public void setRg(String rg)
    {
        this.rg = rg;
    }

    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }
}
