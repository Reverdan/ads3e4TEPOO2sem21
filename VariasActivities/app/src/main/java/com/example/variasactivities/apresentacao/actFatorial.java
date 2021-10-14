package com.example.variasactivities.apresentacao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.variasactivities.R;
import com.example.variasactivities.modelo.Controle;

public class actFatorial extends AppCompatActivity
{
    EditText edtFatorialNumero;
    Button btnFatorialCalcular;
    TextView txvFatorialResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_fatorial);
        this.inicializarComponentes();
        this.eventos();
    }

    private void inicializarComponentes()
    {
        edtFatorialNumero = findViewById(R.id.edtFatorialNumero);
        btnFatorialCalcular = findViewById(R.id.btnFatorialCalcular);
        txvFatorialResultado = findViewById(R.id.txvFatorialResultado);
    }

    private void eventos()
    {
        btnFatorialCalcular.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Controle controle = new Controle();
                controle.fatorial(edtFatorialNumero.getText().toString());
                if (controle.getMensagem().equals(""))
                    txvFatorialResultado.setText(controle.toString());
                else
                {
                    Toast.makeText(getApplicationContext(), controle.getMensagem(),
                            Toast.LENGTH_LONG).show();
                    txvFatorialResultado.setText("");
                }
            }
        });
    }
}