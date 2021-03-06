package com.example.crudpessoas.modelo;

import android.content.Context;

import com.example.crudpessoas.dal.PessoaDAO;

import java.util.List;

public class Controle
{
    private String mensagem;
    private Context contexto;

    public Controle(Context contexto)
    {
        this.contexto = contexto;
    }

    public void cadastrarPessoa(List<String> listaDadosPessoa)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarDadosPessoa(listaDadosPessoa);
        if (validacao.getMensagem().equals(""))
        {
            Pessoa pessoa = new Pessoa(0,
                    listaDadosPessoa.get(0),
                    listaDadosPessoa.get(1),
                    listaDadosPessoa.get(2));
            PessoaDAO pessoaDAO = new PessoaDAO(contexto);
            pessoaDAO.cadastrarPessoa(pessoa);
            this.mensagem = pessoaDAO.getMensagem();
        }
        else
        {
            this.mensagem = validacao.getMensagem();
        }
    }

    public Pessoa pesquisarPessoaPorId(String id)
    {
        this.mensagem = "";
        Pessoa pessoa = new Pessoa();
        Validacao validacao = new Validacao();
        validacao.validarId(id);
        if (validacao.getMensagem().equals(""))
        {
            pessoa.setId(validacao.getId());
            PessoaDAO pessoaDAO = new PessoaDAO(contexto);
            pessoa = pessoaDAO.pesquisarPessoaPorId(pessoa);
        }
        else
        {
            this.mensagem = validacao.getMensagem();
        }
        return pessoa;
    }

    public String getMensagem()
    {
        return mensagem;
    }
}
