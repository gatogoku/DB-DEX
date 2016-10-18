package com.example.portatil20.db_dex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ListView listViewTask;
    private ArrayList<Chars> Personajes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_init);


        setContentView(R.layout.list_menu);
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
       // setTitle("CLASES");
        Personajes = new ArrayList<Chars>();
        Personajes.add(new Chars("HOLA",R.drawable.db2,"SOY GOKU"));
        Personajes.add(new Chars("HOLA",R.drawable.db2,"SOY GOHAN"));
        Personajes.add(new Chars("HOLA",R.drawable.db2,"SOY VEGETA"));
        Personajes.add(new Chars("HOLA",R.drawable.db2,"SOY VEGETA"));
        Personajes.add(new Chars("HOLA",R.drawable.db2,"SOY VEGETA"));
        Personajes.add(new Chars("HOLA",R.drawable.db2,"SOY VEGETA"));
        Personajes.add(new Chars("HOLA",R.drawable.db2,"SOY VEGETA"));
        Personajes.add(new Chars("HOLA",R.drawable.db2,"SOY VEGETA"));
        Personajes.add(new Chars("HOLA",R.drawable.db2,"SOY VEGETA"));
        Personajes.add(new Chars("HOLA",R.drawable.db2,"SOY VEGETA"));





        AdapterBase AB = new AdapterBase(this, Personajes);
        listViewTask = (ListView) findViewById(R.id.listView);
        listViewTask.setAdapter(AB);


       listViewTask.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
              intent.putExtra("I", Personajes.get(i).getImagen());
                intent.putExtra("N", Personajes.get(i).getName());
                intent.putExtra("D", Personajes.get(i).getDescripion());

                startActivity(intent);

            }
        });


    }






}