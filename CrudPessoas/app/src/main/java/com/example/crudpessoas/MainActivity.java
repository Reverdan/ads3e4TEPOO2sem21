package com.example.crudpessoas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.crudpessoas.apresentacao.mnaCadastro;
import com.example.crudpessoas.apresentacao.mnaPesquisarEditarExcluir;

public class MainActivity extends AppCompatActivity
{
    Button btnPrincipalCadastrar;
    Button btnPrincipalPEE;
    Intent intCadastrar;
    Intent intPEE;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarComponentes();
        eventos();
    }

    private void inicializarComponentes()
    {
        btnPrincipalCadastrar = findViewById(R.id.btnPrincipalCadastrar);
        btnPrincipalPEE = findViewById(R.id.btnPrincipalPEE);
        intCadastrar = new Intent(getApplicationContext(), mnaCadastro.class);
        intPEE = new Intent(getApplicationContext(), mnaPesquisarEditarExcluir.class);
    }

    private void eventos()
    {
        btnPrincipalCadastrar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(intCadastrar);
            }
        });

        btnPrincipalPEE.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(intPEE);
            }
        });
    }
}