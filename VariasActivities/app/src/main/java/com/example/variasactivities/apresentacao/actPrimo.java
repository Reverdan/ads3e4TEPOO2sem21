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

public class actPrimo extends AppCompatActivity
{

    EditText edtPrimoNumero;
    Button btnPrimoCalcular;
    TextView txvPrimoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_primo);
        this.inicializarComponentes();
        this.eventos();
    }

    private void inicializarComponentes()
    {
        edtPrimoNumero = findViewById(R.id.edtPrimoNumero);
        btnPrimoCalcular = findViewById(R.id.btnPrimoCalcular);
        txvPrimoResultado = findViewById(R.id.txvPrimoResultado);
    }

    private void eventos()
    {
        btnPrimoCalcular.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Controle controle = new Controle();
                controle.primo(edtPrimoNumero.getText().toString());
                if (controle.getMensagem().equals(""))
                    txvPrimoResultado.setText(controle.toString());
                else
                {
                    Toast.makeText(getApplicationContext(), controle.getMensagem(),
                            Toast.LENGTH_LONG).show();
                    txvPrimoResultado.setText("");
                }
            }
        });
    }
}