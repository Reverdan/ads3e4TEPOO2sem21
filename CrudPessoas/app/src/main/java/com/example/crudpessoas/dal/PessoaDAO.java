package com.example.crudpessoas.dal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.crudpessoas.modelo.Pessoa;

public class PessoaDAO
{
    private Context contexto;
    private String mensagem;

    public PessoaDAO(Context contexto)
    {
        this.contexto = contexto;
    }

    public void cadastrarPessoa(Pessoa pessoa)
    {
        this.mensagem = "";
        try
        {
            Banco banco = new Banco(this.contexto);
            SQLiteDatabase sqlite = banco.getWritableDatabase();
            ContentValues valores = new ContentValues();
            valores.put("nome", pessoa.getNome());
            valores.put("rg", pessoa.getRg());
            valores.put("cpf", pessoa.getCpf());
            long resultado = sqlite.insert("pessoas", null, valores);
            if (resultado == -1)
                this.mensagem = "Erro no cadastro";
            else
                this.mensagem = "Pessoa cadastrada";
        }
        catch (Exception e)
        {
            this.mensagem = "Erro no BD";
//            this.mensagem = e.getMessage();
        }
    }

    public Pessoa pesquisarPessoaPorId(Pessoa pessoa)
    {
        Banco banco = new Banco(this.contexto);
        SQLiteDatabase sqlite = banco.getReadableDatabase();
        Cursor cursor = sqlite.rawQuery("select * from pessoas where id = ?",
                new String[]{String.valueOf(pessoa.getId())});
        if (cursor.getCount() > 0)
        {
            cursor.moveToFirst();
            pessoa.setNome(cursor.getString(1));
            pessoa.setRg(cursor.getString(2));
            pessoa.setCpf(cursor.getString(3));
        }
        return pessoa;
    }

    public String getMensagem()
    {
        return mensagem;
    }
}
