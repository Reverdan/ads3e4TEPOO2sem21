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
import com.example.crudpessoas.modelo.Pessoa;

public class mnaPesquisarEditarExcluir extends AppCompatActivity
{
    EditText edtPEEId;
    Button btnPEEPesquisarId;
    EditText edtPEENome;
    EditText edtPEERg;
    EditText edtPEECpf;
    Context contexto;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mna_pesquisar_editar_excluir);
        inicializarComponentes();
        eventos();
    }

    private void inicializarComponentes()
    {
        edtPEEId = findViewById(R.id.edtPEEId);
        btnPEEPesquisarId = findViewById(R.id.btnPEEPesquisarId);
        edtPEENome = findViewById(R.id.edtPEENome);
        edtPEERg = findViewById(R.id.edtPEERg);
        edtPEECpf = findViewById(R.id.edtPEECpf);
        contexto = getApplicationContext();
    }

    private void eventos()
    {
        btnPEEPesquisarId.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Controle controle = new Controle(contexto);
                Pessoa pessoa = controle.pesquisarPessoaPorId(edtPEEId.getText().toString());
                if (pessoa.getNome() == null || pessoa.getNome().equals(""))
                {
                    edtPEENome.setText("");
                    edtPEERg.setText("");
                    edtPEECpf.setText("");
                    Toast.makeText(contexto, "Pesquisa inválida", Toast.LENGTH_LONG).show();
                }
                else
                {
                    edtPEENome.setText(pessoa.getNome());
                    edtPEERg.setText(pessoa.getRg());
                    edtPEECpf.setText(pessoa.getCpf());
                }
            }
        });
    }
}