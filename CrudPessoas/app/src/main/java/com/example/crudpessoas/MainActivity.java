package com.example.crudpessoas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.crudpessoas.apresentacao.mnaCadastro;

public class MainActivity extends AppCompatActivity
{
    Button btnPrincipalCadastrar;
    Intent intCadastrar;

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
        intCadastrar = new Intent(getApplicationContext(), mnaCadastro.class);
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
    }
}