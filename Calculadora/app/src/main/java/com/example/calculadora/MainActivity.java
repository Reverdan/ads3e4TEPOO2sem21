package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.calculadora.modelo.Controle;

public class MainActivity extends AppCompatActivity
{

    EditText edtNumero1;
    EditText edtNumero2;
    Button btnSomar;
    Button btnSubtrair;
    Button btnMultiplicar;
    Button btnDividir;
    TextView txvResultado;
    Context contexto;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarComponentes();
        eventos();
    }

    public void inicializarComponentes()
    {
        edtNumero1 = findViewById(R.id.edtNumero1);
        edtNumero2 = findViewById(R.id.edtNumero2);
        btnSomar = findViewById(R.id.btnSomar);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        txvResultado = findViewById(R.id.txvResultado);
        contexto = getApplicationContext();
    }

    public void enviarControle(String op)
    {
        Controle controle = new Controle(edtNumero1.getText().toString(),
                edtNumero2.getText().toString(), op, contexto);
        if (controle.getMensagem().equals("")) txvResultado.setText(controle.toString());
        else
        {
            Toast.makeText(getApplicationContext(), controle.getMensagem(),
                    Toast.LENGTH_LONG).show();
            txvResultado.setText("");
        }
    }

    public void eventos()
    {
        btnSomar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                enviarControle("+");
            }
        });

        btnSubtrair.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                enviarControle("-");
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                enviarControle("*");
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                enviarControle("/");
            }
        });
    }
}