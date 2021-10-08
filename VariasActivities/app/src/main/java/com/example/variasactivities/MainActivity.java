package com.example.variasactivities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.variasactivities.apresentacao.actFatorial;
import com.example.variasactivities.apresentacao.actPrimo;

public class MainActivity extends AppCompatActivity
{
    Button btnPrimo;
    Button btnFatorial;

    Intent intPrimo;
    Intent intFatorial;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarComponentes();
        eventos();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
//        if (item.getItemId() == R.id.itmPrimo)
//        {
//            startActivity(intPrimo);
//        }
//        if (item.getItemId() == R.id.itmFatorial)
//        {
//            startActivity(intFatorial);
//        }
        switch (item.getItemId())
        {
            case R.id.itmPrimo:
                startActivity(intPrimo);
                return true;
            case R.id.itmFatorial:
                startActivity(intFatorial);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void inicializarComponentes()
    {
        btnPrimo = findViewById(R.id.btnPrimo);
        btnFatorial = findViewById(R.id.btnFatorial);

        intPrimo = new Intent(this, actPrimo.class);
        intFatorial = new Intent(this, actFatorial.class);
    }

    private void eventos()
    {
        btnPrimo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(intPrimo);
            }
        });

        btnFatorial.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(intFatorial);
            }
        });
    }
}