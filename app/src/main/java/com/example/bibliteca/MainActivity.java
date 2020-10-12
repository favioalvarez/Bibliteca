package com.example.bibliteca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;
import androidx.arch.core.executor.TaskExecutor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.os.AsyncTask;

import java.util.ArrayList;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progress;
    private Button btn;
    private ImageButton ibtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progress = (ProgressBar)findViewById(R.id.PGBR);
        btn = (Button)findViewById(R.id.BTN_log);
        ibtn =(ImageButton)findViewById(R.id.IBTN);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task().execute();
            }
        });
        progress.setVisibility(View.INVISIBLE);
        ibtn.setVisibility(View.INVISIBLE);

    }
    // tarea asincrona
    class Task extends AsyncTask<String,Void,String> {


        @Override
        protected void onPreExecute() {

        progress.setVisibility(View.VISIBLE);

        }
        // tarea pesada
        @Override
        protected String doInBackground(String... strings) {

            for(int i=1; i<=10;i++)
            {
                try
                {
                    Thread.sleep(1000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
        progress.setVisibility(View.INVISIBLE);
        ibtn.setVisibility(View.VISIBLE);
        }
    }
    public void github(View v)
    {
        ArrayList<String> libros = new ArrayList<String>();

        libros.add("Farenheith");
        libros.add("Revival");
        libros.add("El Alquimista");
       Intent i = new Intent(this , github_act.class);
       i.putExtra("ListaLibros",libros);
       startActivity(i);
    }

}