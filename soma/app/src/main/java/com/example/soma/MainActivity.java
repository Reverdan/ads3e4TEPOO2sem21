package com.example.soma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText edtNumero1;
    EditText edtNumero2;
    Button btnSomar;
    TextView txvResultado;

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
        txvResultado = findViewById(R.id.txvResultado);
    }

    public void eventos()
    {
        btnSomar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                try
                {
                    Double num1 = Double.parseDouble(edtNumero1.getText().toString());
                    Double num2 = Double.parseDouble(edtNumero2.getText().toString());
                    Double res = num1 + num2;
                    txvResultado.setText(res.toString());
                }
                catch (NumberFormatException e)
                {
                    txvResultado.setText("Digite números válidos");
                    Toast.makeText(getApplicationContext(), "Digite números válidos", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}