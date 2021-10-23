package com.example.crudpessoas.apresentacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.crudpessoas.R;
import com.example.crudpessoas.modelo.Controle;

import java.util.ArrayList;
import java.util.List;

public class mnaCadastro extends AppCompatActivity
{
    EditText edtCadastroNome;
    EditText edtCadastroRg;
    EditText edtCadastroCpf;
    Button btnCadastroCadastrar;
    Context contexto;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mna_cadastro);
        inicializarComponentes();
        eventos();
    }

    private void inicializarComponentes()
    {
        edtCadastroNome = findViewById(R.id.edtCadastroNome);
        edtCadastroRg = findViewById(R.id.edtCadastroRg);
        edtCadastroCpf = findViewById(R.id.edtCadastroCpf);
        btnCadastroCadastrar = findViewById(R.id.btnCadastroCadastrar);
        contexto = getApplicationContext();
    }

    private void eventos()
    {
        btnCadastroCadastrar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Controle controle = new Controle(contexto);
                List<String> listaDadosPessoa = new ArrayList<>();
                listaDadosPessoa.add(edtCadastroNome.getText().toString());
                listaDadosPessoa.add(edtCadastroRg.getText().toString());
                listaDadosPessoa.add(edtCadastroCpf.getText().toString());
                controle.cadastrarPessoa(listaDadosPessoa);
                Toast.makeText(contexto, controle.getMensagem(), Toast.LENGTH_LONG).show();
            }
        });
    }
}