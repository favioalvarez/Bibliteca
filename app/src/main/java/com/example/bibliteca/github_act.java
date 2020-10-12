package com.example.bibliteca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import Clases.Libros;

public class github_act extends AppCompatActivity {
    private Spinner spn;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);

        spn = (Spinner)findViewById(R.id.SPN);
        text = (TextView)findViewById(R.id.TV_valor);

        //Recibe datos
        ArrayList<String> listaLibros = (ArrayList<String>) getIntent().getSerializableExtra("ListaLibros");
        ArrayAdapter<String> adap = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, listaLibros);
        spn.setAdapter(adap);
    }
    public void Precios(View v)
    {
        Libros li = new Libros();
        String libro = spn.getSelectedItem().toString();

        if(libro.equals("Farenheith"))

        {
            text.setText("el precio del libro farenheith es: "+ li.getFarenheith());
        }
        if(libro.equals("Revival"))
        {
            text.setText("el precio del libro farenheith es: "+ li.getRevival());
        }
        if(libro.equals("El Alquimista"))
        {
            text.setText("el precio del libro farenheith es: "+ li.getAlquimista());
        }
    }
}