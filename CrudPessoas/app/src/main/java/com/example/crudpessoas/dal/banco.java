package com.example.crudpessoas.dal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class banco extends SQLiteOpenHelper
{
    public banco(Context contexto)
    {
        super(contexto, "CrudPessoas.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        String instrucaoSql = "create table pessoas " +
                              "(id integer primary key autoincrement, " +
                              "nome text, " +
                              "rg text, " +
                              "cpf text)";
        sqLiteDatabase.execSQL(instrucaoSql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {

    }
}
