package com.example.temperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.temperatura.modelo.Controle;

public class MainActivity extends AppCompatActivity
{

    EditText edtValorTemperatura;
    RadioButton rdbCelsiusFahrenheit;
    RadioButton rdbFahrenheitCelsius;
    Button btnConverter;
    TextView txvResultado;

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
        edtValorTemperatura = findViewById(R.id.edtValorTemperatura);
        rdbCelsiusFahrenheit = findViewById(R.id.rdbCelsiusFahrenheit);
        rdbFahrenheitCelsius = findViewById(R.id.rdbFahrenheitCelsius);
        btnConverter = findViewById(R.id.btnConverter);
        txvResultado = findViewById(R.id.txvResultado);
    }

    private void eventos()
    {
        btnConverter.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String tipo = "";
                if (rdbCelsiusFahrenheit.isChecked()) tipo = "CF";
                else tipo = "FC";
                Controle controle = new Controle(edtValorTemperatura.getText().toString(), tipo);
                if (controle.getMensagem().equals(""))
                {
                    txvResultado.setText(controle.getTemp());
                }
                else
                {
                    edtValorTemperatura.setText("");
                    Toast.makeText(getApplicationContext(), controle.getMensagem(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}