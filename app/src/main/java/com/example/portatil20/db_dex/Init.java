package com.example.portatil20.db_dex;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Init extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_init);
        ImageView iv = (ImageView) findViewById(R.id.imageView);
        //int photo = (int) getIntent().getExtras().get("I");
        //Drawable drag = new Drawable(new Resources(photo));
        //iv.setBackground(new Drawable());
    }

    public void showChars(View view){
        Intent intento = new Intent(this, MainActivity.class);

        startActivity(intento);
    }
}
